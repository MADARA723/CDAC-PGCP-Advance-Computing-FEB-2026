package com.library.controller;

import java.io.IOException;
import java.util.List;

import com.library.dao.BookDao;
import com.library.dao.BookDaoImpl;
import com.library.model.Book;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {

    BookDao dao = new BookDaoImpl();

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        if ("view".equals(action)) {

            List<Book> list = dao.getAllBooks();

            request.setAttribute("books", list);

            RequestDispatcher rd =
                    request.getRequestDispatcher(
                    "/displayBooks.jsp");

            rd.forward(request, response);
        }

        else if ("delete".equals(action)) {

            int id =
                    Integer.parseInt(
                    request.getParameter("id"));

            dao.deleteBook(id);

            response.sendRedirect(
                    "BookServlet?action=view");
        }

        else if ("edit".equals(action)) {

            int id =
                    Integer.parseInt(
                    request.getParameter("id"));

            Book b = dao.getBookById(id);

            request.setAttribute("book", b);

            RequestDispatcher rd =
                    request.getRequestDispatcher(
                    "/editBook.jsp");

            rd.forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String action =
                request.getParameter("action");

        if ("add".equals(action)) {

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
                    new Book(id, title,
                            author, price);

            dao.addBook(b);

            response.sendRedirect(
                    "BookServlet?action=view");
        }

        else if ("update".equals(action)) {

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
                    new Book(id, title,
                            author, price);

            dao.updateBook(b);

            response.sendRedirect(
                    "BookServlet?action=view");
        }
    }
}