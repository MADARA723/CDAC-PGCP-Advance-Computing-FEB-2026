package com.demo.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Counterservlet
 */
@WebServlet("/getcount")
public class Counterservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int cnt=Integer.parseInt(request.getParameter("count"));
		cnt++;
		out.println("<h1> You clicked "+cnt+" Times");

		//url rewriting to remember previous value of count
		out.println("<a href='getcount?count="+cnt+"'>Click me</a>");
		
	}

}
