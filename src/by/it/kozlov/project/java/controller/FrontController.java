package by.it.kozlov.project.java.controller;

import by.it.kozlov.project.java.filters.CookiesUser;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.text.ParseException;

public class FrontController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            process(request, response);
        } catch (ParseException | SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            process(request, response);
        } catch (ParseException | SQLException e) {
            e.printStackTrace();
        }
    }

    private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException, SQLException {
        ActionFactory actionFactory = new ActionFactory();
        Action command = actionFactory.defineCommand(request);
        Action nextStep = null;
        ServletContext servletContext = getServletContext();
        HttpSession session = request.getSession();
        if (session.getAttribute(Message.MESSAGE) != null) {
            request.setAttribute(Message.MESSAGE, session.getAttribute(Message.MESSAGE));
            session.setAttribute(Message.MESSAGE, null);
        }
        try {
            CookiesUser.getSession(request);
        } catch (NoSuchPaddingException | BadPaddingException | NoSuchAlgorithmException | IllegalBlockSizeException | InvalidKeyException e) {
            e.printStackTrace();
        }
        try {
            nextStep = command.execute(request, response);
        } catch (Exception e) {
            request.setAttribute(Message.ERROR, e.getMessage());
            String errorJsp = Actions.ERROR.command.getJsp();
            RequestDispatcher dispatcher = servletContext.getRequestDispatcher(errorJsp);
            dispatcher.forward(request, response);
        }
        if (nextStep == null || nextStep == command) {
            String viewJsp = command.getJsp();
            RequestDispatcher dispatcher = servletContext.getRequestDispatcher(viewJsp);
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect("do?command=" + nextStep);
        }
    }
}
