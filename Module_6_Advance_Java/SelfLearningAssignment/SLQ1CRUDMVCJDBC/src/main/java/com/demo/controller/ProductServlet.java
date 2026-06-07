package com.demo.controller;

import java.io.IOException;
import java.util.List;

import com.demo.model.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {

    ProductService service = new ProductServiceImpl();

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        if(action.equals("view")) {

            List<Product> plist =
                    service.getAllProducts();

            request.setAttribute("plist", plist);

            RequestDispatcher rd =
                    request.getRequestDispatcher(
                    "displayProducts.jsp");

            rd.forward(request, response);
        }

        else if(action.equals("delete")) {

            int pid =
                Integer.parseInt(
                request.getParameter("pid"));

            service.deleteProduct(pid);

            response.sendRedirect(
                "ProductServlet?action=view");
        }

        else if(action.equals("edit")) {

            int pid =
                Integer.parseInt(
                request.getParameter("pid"));

            Product p =
                service.getProductById(pid);

            request.setAttribute("product", p);

            RequestDispatcher rd =
                request.getRequestDispatcher(
                "editProduct.jsp");

            rd.forward(request,response);
        }
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String action =
                request.getParameter("action");

        if(action.equals("add")) {

            int pid =
                Integer.parseInt(
                request.getParameter("pid"));

            String pname =
                request.getParameter("pname");

            int qty =
                Integer.parseInt(
                request.getParameter("qty"));

            double price =
                Double.parseDouble(
                request.getParameter("price"));

            Product p =
                new Product(pid,pname,qty,price);

            service.addProduct(p);

            response.sendRedirect(
                    "ProductServlet?action=view");
        }

        else if(action.equals("update")) {

            int pid =
                Integer.parseInt(
                request.getParameter("pid"));

            String pname =
                request.getParameter("pname");

            int qty =
                Integer.parseInt(
                request.getParameter("qty"));

            double price =
                Double.parseDouble(
                request.getParameter("price"));

            Product p =
                new Product(pid,pname,qty,price);

            service.updateProduct(p);

            response.sendRedirect(
                "ProductServlet?action=view");
        }
    }
}