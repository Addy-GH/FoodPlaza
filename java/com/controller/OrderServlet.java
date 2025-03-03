package com.controller;

import java.io.IOException;

import com.squad.Dao.CartDaoImpl;
import com.squad.Dao.OrderDaoImpl;
import com.squad.Pojo.Orders;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {
	
	OrderDaoImpl odi = new OrderDaoImpl();
	CartDaoImpl cdi = new CartDaoImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		String email = (String)session.getAttribute("uEmail");
		
		Orders o = odi.placeOrder(email);
		if(o!=null) {
			boolean b = cdi.clearCart(email);
			if(b) {
				req.setAttribute("order", o);
				req.getRequestDispatcher("Bill.jsp").forward(req, resp);
			}
		else {
			resp.sendRedirect("Fail.jsp");
		}
		}
	}

}
