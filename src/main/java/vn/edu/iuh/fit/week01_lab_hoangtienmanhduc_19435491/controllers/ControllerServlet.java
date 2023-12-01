package vn.edu.iuh.fit.week01_lab_hoangtienmanhduc_19435491.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.week01_lab_hoangtienmanhduc_19435491.entities.Account;
import vn.edu.iuh.fit.week01_lab_hoangtienmanhduc_19435491.services.AccountServices;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

//@WebServlet(urlPatterns = {"/ControllerServlet", "/control"})
@WebServlet(name = "/ControllerServlet", value = "/control")
public class ControllerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        PrintWriter out = response.getWriter();
        AccountServices accountServices = new AccountServices();
        Account account = new Account("1", "Duc","1234", "duc@gmail.com", "123456789", 0);
        accountServices.save(account);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

    }

}
