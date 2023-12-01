package vn.edu.iuh.fit.week01_lab_hoangtienmanhduc_19435491;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.iuh.fit.week01_lab_hoangtienmanhduc_19435491.entities.Account;
import vn.edu.iuh.fit.week01_lab_hoangtienmanhduc_19435491.services.AccountServices;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        AccountServices accountServices = new AccountServices();
        Account account = new Account("1", "Duc","1234", "duc@gmail.com", "123456789", 0);
        accountServices.save(account);
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}