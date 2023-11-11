package com.e_shop.controller;

import com.e_shop.dao.LoginDao;
import com.e_shop.model.Entity.Account;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "SignupControl", urlPatterns = {"/signup"})
public class SignupControl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String username = req.getParameter("user");
        String password = req.getParameter("pass");
        String rePassword = req.getParameter("repass");
        String fullname = req.getParameter("fullname");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        if (!password.equals(rePassword)){
            resp.sendRedirect("login.jsp");
        }else {
            LoginDao loginDao = new LoginDao();
            Account account = loginDao.checkAccountExist(username);
            if (account == null){
                resp.sendRedirect("product");
            }else {
                resp.sendRedirect("login.jsp");
            }
        }
    }
}
