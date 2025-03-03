package com.controller;

import java.io.IOException;
import java.util.List;

import com.squad.Dao.CustomerDaoImpl;
import com.squad.Pojo.Customer;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Customer")
public class CustomerServlet extends HttpServlet {
	
	CustomerDaoImpl custdi = new CustomerDaoImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
//		String email1 = (String)session.getAttribute("email");
//		String pass1 = (String)session.getAttribute("pass");
		
		String action = (String)req.getParameter("action");
		String name = (String)req.getParameter("cname");
		String email = (String)req.getParameter("email");
		String pass = (String)req.getParameter("pass");
		String adr = (String)req.getParameter("adr");
		long con = Long.parseLong(req.getParameter("cno"));
		
		if(action!=null && action.equals("AddCustomer")) {
			boolean b = custdi.addCustomer(new Customer(name, email, pass, con, adr));
			if(b) {
				resp.sendRedirect("Success.jsp");
			}else{
				resp.sendRedirect("Fail.jsp");
			}
		}
		
		if(action!=null && action.equals("UpdateCustomer")) {
			String mailID = req.getParameter("email");
			Customer c = new Customer(name, email, pass, con, adr);
			c.setCustomerEmailID(mailID);
			boolean b = custdi.updateCustomerById(c);
			if(b) {
				resp.sendRedirect("Success.jsp");
			}else{
				resp.sendRedirect("Fail.jsp");
			}
		}
		
		
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		String action = req.getParameter("action");
		if(action!=null && action.equals("delete")) {
			String emailId = req.getParameter("emailId");
			boolean b = custdi.deleteCustomerById(emailId);
			if(b) {
				resp.sendRedirect("Customer");
			}else{
				resp.sendRedirect("Fail.jsp");
			}
		}
		else {
			List<Customer>l = custdi.getAllCustomer();
			if(l!=null && !(l.isEmpty())) {
				session.setAttribute("custlist", l);
				resp.sendRedirect("CustomerList.jsp");
			}else {
				resp.sendRedirect("Fail.jsp");
			}
		}
		
		
	}

}
