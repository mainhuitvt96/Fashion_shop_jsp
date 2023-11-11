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
@WebServlet(name = "product", urlPatterns = "/product")
public class productServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "showProduct":
                break;
            default:{
                response.setContentType("text/html;charset=UTF-8");
                request.setCharacterEncoding("UTF-8");
                ProductDAO productDAO = new ProductDAO();
                List<Product> listProduct = productDAO.getAllProduct();
                request.setAttribute("listP", listProduct);
                CategoryDAO categoryDAO = new CategoryDAO();
                List<Categories> categoriesList = categoryDAO.getAllCategories();
                request.setAttribute("listC", categoriesList);
                request.getRequestDispatcher("product.jsp").forward(request, response);
            }
        }

    }

}
