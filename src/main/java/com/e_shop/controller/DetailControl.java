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

@WebServlet(name = "DetailControl", urlPatterns = {"/detail"})
public class DetailControl extends HttpServlet {
    ProductDAO productDAO = null;
    public DetailControl() {
        this.productDAO = new ProductDAO();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        long id = Long.parseLong(req.getParameter("pid"));
        Product product = productDAO.getProductById(id);
        req.setAttribute("detail", product);
        CategoryDAO categoryDAO = new CategoryDAO();
        List<Categories> categoriesList = categoryDAO.getAllCategories();
        req.setAttribute("listC", categoriesList);
        req.getRequestDispatcher("detail.jsp").forward(req,resp);


    }

}
