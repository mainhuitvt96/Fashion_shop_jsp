package com.e_shop.controller;

import com.e_shop.dao.CategoryDAO;
import com.e_shop.dao.ProductDAO;
import com.e_shop.model.Entity.Categories;
import com.e_shop.model.Entity.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SearchControl", urlPatterns = {"/search"})
public class SearchControl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String txtSearch = req.getParameter("txt");
        ProductDAO productDAO = new ProductDAO();
        List<Product> list = productDAO.searchByName(txtSearch);
        req.setAttribute("listP", list);
        CategoryDAO categoryDAO = new CategoryDAO();
        List<Categories> categoriesList = categoryDAO.getAllCategories();
        req.setAttribute("listC", categoriesList);
        req.setAttribute("txtS", txtSearch);
        req.getRequestDispatcher("/product.jsp").forward(req,resp);
    }
}
