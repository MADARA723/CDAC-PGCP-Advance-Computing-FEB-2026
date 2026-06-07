package com.air.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/PassengerServlet")
public class PassengerServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session =
                request.getSession();

        session.setAttribute(
                "passenger",
                request.getParameter("passenger"));

        session.setAttribute(
                "age",
                request.getParameter("age"));

        session.setAttribute(
                "gender",
                request.getParameter("gender"));

        response.sendRedirect(
                "confirmation.jsp");
    }
}