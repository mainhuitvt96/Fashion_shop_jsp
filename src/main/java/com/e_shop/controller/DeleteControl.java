package com.e_shop.controller;

import com.e_shop.dao.ProductDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "DeleteControl", urlPatterns = "/delete")
public class DeleteControl extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String pid = req.getParameter("pid");
        ProductDAO productDAO = new ProductDAO();
        productDAO.deleteProductById(pid);
        resp.sendRedirect("manager");
    }
}
