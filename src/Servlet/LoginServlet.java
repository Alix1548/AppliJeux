package Servlet;

import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

//        HttpSession session = request.getSession();
//        session.getAttribute("login",id);

        String erreur = "Login ou mot de passe incorect";
        request.setAttribute("message",erreur);

        String user = request.getParameter("username");
        String password = request.getParameter("password");
        //System.out.println(user + password);


    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
