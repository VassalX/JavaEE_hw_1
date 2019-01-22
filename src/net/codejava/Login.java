package net.codejava;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Login")
public class Login extends HttpServlet {

    private static final String USER = "admin";
    private static final String PASS = "1234";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        if(user.equals(USER) && pass.equals(PASS)){
            request.getRequestDispatcher("/WEB-INF/success.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("/WEB-INF/incorrect.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
    }
}
