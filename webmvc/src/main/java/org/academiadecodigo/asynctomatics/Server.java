package org.academiadecodigo.asynctomatics;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Server extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User user = new User();
        user.setName("Vasco Ferraz");
        user.setEmail("vascoferraz@teste.com");

        req.setAttribute("user", user);

        RequestDispatcher page1Dispatcher = req.getRequestDispatcher("/index.html");
        page1Dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");

        if (name == null || name.isEmpty() || email == null || email.isEmpty()) {
            resp.sendRedirect("/helloPost/response.html");
        } else {
            resp.getWriter().printf("<h1> Hello %s, welcome to our server! Your email is %s</h1>", name, email);
            resp.getWriter().printf("<a href=\"\">wow! take me back</a>");
        }
    }
}
