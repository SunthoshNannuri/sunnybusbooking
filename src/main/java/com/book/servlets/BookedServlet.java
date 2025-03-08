package com.book.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.servlets.Model.Dbdetails;
import com.book.servlets.Model.DetailsModel;



public class BookedServlet extends HttpServlet{
		
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
		{
			 String username="";
			 String password="";
			System.out.println("came to book servlet");
		String name=req.getParameter("name");	
		String email=req.getParameter("email");	
		String phone=req.getParameter("phone");	
		String from=req.getParameter("from");	
		String to=req.getParameter("to");	
		String gender=req.getParameter("gender");
		String seatno=req.getParameter("seat");
		String date=req.getParameter("date");
		System.out.println("i am in book servlet"+email);
		UserRepository user=new UserRepository();
		List<DetailsModel> userdetails=user.getuser();

        System.out.println(userdetails);

        if (userdetails != null && !userdetails.isEmpty()) {
            // Accessing the first DetailsModel object in the list
            DetailsModel details = userdetails.get(0);

 
            username = details.getUsername();
            password = details.getPassword();

            // Printing the values (or using them as needed)
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        } else {
            System.out.println("No user details found.");
        }
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

		   	
         UserRepository repo=new UserRepository();
         repo.details(username,password,from,to,name,email,phone,gender,seatno,date,db);
         req.setAttribute("email",email);
         req.setAttribute("name",name);
         System.out.println("jspp file");
         RequestDispatcher dispatcher = req.getRequestDispatcher("scanner.jsp");
 		dispatcher.forward(req, resp);
 		
         
		   	
		}

}
