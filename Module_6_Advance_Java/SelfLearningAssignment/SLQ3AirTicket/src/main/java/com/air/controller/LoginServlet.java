package com.air.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String uname =
                request.getParameter("username");

        String pwd =
                request.getParameter("password");

        if("admin".equals(uname)
                && "admin".equals(pwd)) {

            HttpSession session =
                    request.getSession();

            session.setAttribute(
                    "username", uname);

            response.sendRedirect(
                    "flights.jsp");
        }
        else {
            response.sendRedirect(
                    "error.jsp");
        }
    }
}