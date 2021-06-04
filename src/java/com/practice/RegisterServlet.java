package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        
        out.println("<h1> Hello </h1>");
        String name = req.getParameter("user_name");
        String pass = req.getParameter("user_password");
        String email = req.getParameter("user_email");
        String gender = req.getParameter("user_gender");
        String course = req.getParameter("user_course");
        
        String cond = req.getParameter("condition");
        if(cond!=null){
       
        if(cond.equals("checked")){
            out.println("<h2>Name: "+name+"</h2>");
            out.println("<h2>Password: "+pass+"</h2>");
            out.println("<h2>Email: "+email+"</h2>");
            out.println("<h2>Gender: "+gender+"</h2>");
            out.println("<h2>Course: "+course+"</h2>");
        }
        else{
            out.println("<h2>You have not accepted terms of coditions</h2>");
        }
        }
        else{
            out.println("<h2>You have not accepted terms of coditions</h2>");
        }
    } 
}
