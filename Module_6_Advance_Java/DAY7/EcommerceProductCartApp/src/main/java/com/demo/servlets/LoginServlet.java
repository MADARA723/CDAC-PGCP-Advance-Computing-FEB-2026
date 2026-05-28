package com.demo.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

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
	 *
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("uname");
		String passwd=request.getParameter("pswd");
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		LoginService lservice=new LoginServiceImpl();
		MyUser user=lservice.validateUser(uname,passwd);
		
		if(user!=null && user.getRole().equals("user"))
		{
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
			
			RequestDispatcher rd=request.getRequestDispatcher("category");
			rd.forward(request, response);

			
		}
		else
		{
			out.println("Invalid Credentials,Plz Relogin");
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
		}

		
	}

}
