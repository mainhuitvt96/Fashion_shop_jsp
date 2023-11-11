package com.e_shop.controller;

import com.e_shop.dao.LoginDao;
import com.e_shop.model.Entity.Account;

import javax.servlet.DispatcherType;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet (name = "LoginControl", urlPatterns = {"/login"})
public class LoginControl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String username = req.getParameter("user");
        String password = req.getParameter("pass");
        LoginDao loginDao = new LoginDao();
        Account account = loginDao.login(username,password);
        if (account == null){
            req.setAttribute("mess", "Wrong username or password, please try again!");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }else {
            HttpSession session = req.getSession();
            session.setAttribute("acc", account);
            resp.sendRedirect("/product");
        }
    }
}
