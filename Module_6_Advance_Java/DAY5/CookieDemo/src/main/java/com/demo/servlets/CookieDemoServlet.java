package com.demo.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CookieDemoServlet
 */
@WebServlet("/cookiedemo")
public class CookieDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cname=request.getParameter("name");
		String val=request.getParameter("cval");
		String btn=request.getParameter("btn");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		switch(btn)
		{
		case "add" ->{
			//Add cookie in client machine
			Cookie c=new Cookie(cname,val);	
			response.addCookie(c);
			out.println("<h1>Cookie added Successfully</h1>");
			
		}
		case "del"->{
			//Creating array to get cookies
			Cookie[] carr=request.getCookies();
			for(Cookie c:carr)
			{
				if(c.getName().equals(cname))
				{
					//delete Cookie
					c.setMaxAge(0);
					response.addCookie(c);
					break;
				}
				
			}
			out.println("<h1> Cookie is Successfully Deleted</h1>");
		}
		case "show"->
		{
			//display cookies
			//Create array of cookies to display
			Cookie[] carr=request.getCookies();
			for(Cookie c:carr)
			{
				out.println(c.getName()+""+c.getValue());
			}
			
		}
		}
		RequestDispatcher re=request.getRequestDispatcher("CookieDemo.html");
	}

}
