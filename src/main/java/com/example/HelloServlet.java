package com.example;

import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import java.io.*;

@WebServlet(name = "HelloServlet", value = "/hello")
public class HelloServlet extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
        PrintWriter pWriter = resp.getWriter();
        pWriter.println("<h1>HelloWorld</h1>");
    };
}
