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
		UserRepository user=new UserRepository();
		String response=user.truncate();
		System.out.println(response);
		RequestDispatcher dispatch=req.getRequestDispatcher("vistagain.html");
		dispatch.forward(req, resp);
	}

}
