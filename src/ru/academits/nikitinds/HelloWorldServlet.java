package ru.academits.nikitinds;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {
    private static final long serialVersionUID = 1335040735998702922L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        try (PrintWriter responseWriter = resp.getWriter()) {
            responseWriter.println("Hello. I'm learning Java!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}