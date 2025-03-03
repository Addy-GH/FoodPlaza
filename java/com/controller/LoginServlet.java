package com.controller;

import java.io.IOException;

import com.squad.Dao.AdminDaoImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	
	AdminDaoImpl admindi = new AdminDaoImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		String action = req.getParameter("action");
		String type = req.getParameter("type");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		if(action!=null && action.equals("Login")) {
			if(type.equals("admin")) {
				boolean b = admindi.admin(email, pass);
				if(b) {
					session.setAttribute("aEmail", email);
					resp.sendRedirect("AdminLogin.jsp");
				}else {
					resp.sendRedirect("Fail.jsp");
				}
			}
			
			
			if(type.equals("user")) {
				boolean b = admindi.userLogin(email, pass);
				if(b) {
					session.setAttribute("uEmail", email);
					session.setAttribute("pass", pass);
					resp.sendRedirect("UserLogin.jsp");
				}else {
					resp.sendRedirect("Fail.jsp");
				}
			}
			
			
		}
		
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		HttpSession session = req.getSession();
		session.invalidate();
		resp.sendRedirect("index.jsp");
		
	}

}
