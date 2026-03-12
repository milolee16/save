package com.mz.test;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // 일
        Model.makeInfo(request);

        // 어디로?
        request.getRequestDispatcher("output.jsp").forward(request, response);


    }

    public void destroy() {
    }
}