package com.sabel.login;

import com.sabel.todo.ToDoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login.do")

public class LoginServlet extends HttpServlet {

    private LoginService loginService = new LoginService();
    private ToDoService toDoService = new ToDoService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String pass = req.getParameter("password");

        if (loginService.checkPassword(name, pass)) {
            req.setAttribute("name", req.getParameter("name"));
            req.setAttribute("todos", toDoService.retrieveTodos());
            req.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(req, resp);
        } else {
            req.setAttribute("errorMessage","Login nicht erfolgreich");
            req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
        }

    }


}