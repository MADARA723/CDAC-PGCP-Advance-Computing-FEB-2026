package com.air.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/FlightServlet")
public class FlightServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session =
                request.getSession();

        session.setAttribute(
                "flight",
                request.getParameter("flight"));

        session.setAttribute(
                "source",
                request.getParameter("source"));

        session.setAttribute(
                "destination",
                request.getParameter("destination"));

        response.sendRedirect(
                "passenger.jsp");
    }
}