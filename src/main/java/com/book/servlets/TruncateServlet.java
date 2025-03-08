package com.book.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TruncateServlet extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		// Fetch from Render Environment Variables
        String urlsql = System.getenv("DB_URL"); 
        String usernamesql = System.getenv("DB_USERNAME");
        String passwordsql = System.getenv("DB_PASSWORD");

        // Fallback for Local Testing
        if (urlsql == null || urlsql.isEmpty()) {
            ServletContext ctx = getServletContext();
            urlsql = ctx.getInitParameter("url");  // Read from web.xml
            usernamesql = ctx.getInitParameter("username");
            passwordsql = ctx.getInitParameter("password");
        }

        // Store in Object
        Dbdetails db = new Dbdetails();
        db.setUrl(urlsql);
        db.setUsername(usernamesql);
        db.setPassword(passwordsql);

		UserRepository user=new UserRepository();
		String response=user.truncate(db);
		System.out.println(response);
		RequestDispatcher dispatch=req.getRequestDispatcher("vistagain.html");
		dispatch.forward(req, resp);
	}

}
