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

@WebServlet(name = "CategoryControl", urlPatterns = {"/category"})
public class CategoryControl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String categoryId = req.getParameter("cid"); // lấy categoryID
        ProductDAO productDAO = new ProductDAO();
        List<Product> productList = productDAO.getProductByCategoryId(categoryId);
        CategoryDAO categoryDAO = new CategoryDAO();
        List<Categories> categoriesList = categoryDAO.getAllCategories();
        req.setAttribute("listC", categoriesList);
        req.setAttribute("listP", productList);
        req.getRequestDispatcher("product.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
