package com.library.controller;

import java.io.IOException;

import com.library.dao.BookDao;
import com.library.dao.BookDaoImpl;
import com.library.model.Book;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {

    BookDao dao = new BookDaoImpl();

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        int id =
        Integer.parseInt(
        request.getParameter("bookid"));

        String title =
        request.getParameter("title");

        String author =
        request.getParameter("author");

        double price =
        Double.parseDouble(
        request.getParameter("price"));

        Book b =
        new Book(id,title,author,price);

        dao.addBook(b);

        response.sendRedirect(
        "BookServlet?action=view");
    }
}