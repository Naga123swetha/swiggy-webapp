package com.swiggy;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SwiggyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html><head><title>Swiggy</title></head>");
        out.println("<body style='font-family:sans-serif;text-align:center;margin-top:50px;'>");
        out.println("<h1>Welcome to Swiggy Web Application</h1>");
        out.println("<p>Order food online from your favorite restaurants</p>");
        out.println("</body></html>");
    }
}
