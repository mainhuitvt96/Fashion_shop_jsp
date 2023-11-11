package com.e_shop.controller;
import com.e_shop.dao.ProductDAO;
import com.e_shop.model.Entity.Account;
import com.e_shop.model.Entity.Product;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ManagerControl", urlPatterns = {"/manager"})
public class ManagerControl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        HttpSession session = req.getSession();
        Account account = (Account) session.getAttribute("acc");
        long id = account.getId();
        ProductDAO productDAO = new ProductDAO();
        List<Product> productList = productDAO.getProductBySellId(id);

        req.setAttribute("listP", productList);
        req.getRequestDispatcher("manager-product.jsp").forward(req,resp);

    }
}
