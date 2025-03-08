package com.book.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ScannerServlet extends HttpServlet{
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		String otp=req.getParameter("otp");
		System.out.println(otp);
		System.out.println("came to Scanner servelet");
		req.setAttribute("otp",otp);
		 RequestDispatcher dispatcher = req.getRequestDispatcher("enterotptovalidate.jsp");
	 		dispatcher.forward(req, resp);
		
	}

}
