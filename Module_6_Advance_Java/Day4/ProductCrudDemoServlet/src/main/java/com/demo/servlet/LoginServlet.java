package com.demo.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.demo.model.MyUser;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("uname");
		String password=request.getParameter("passwd");
		LoginService lservice=new LoginServiceImpl(); 
		MyUser user =lservice.validateUser(uname,password);
		if(user!= null)
		{
			RequestDispatcher rd=request.getRequestDispatcher("displayall");
			rd.forward(request, response);
		}else
		{
			out.println("Invalid Credentials,pls relogin");
			RequestDispatcher rd=request.getRequestDispatcher("LoginForm.html");
			rd.include(request, response);
		}
	}

}
