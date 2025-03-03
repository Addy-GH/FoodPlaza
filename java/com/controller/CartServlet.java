package com.controller;

import java.io.IOException;
import java.util.List;

import com.squad.Dao.CartDaoImpl;
import com.squad.Pojo.Cart;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Cart")
public class CartServlet extends HttpServlet {
	
	CartDaoImpl cdi = new CartDaoImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		String action = req.getParameter("action");
		String fname = (String)session.getAttribute("fName");
		
		if(action!=null && action.equals("AddToCart")) {
			
			String name = req.getParameter("fname");
			String email = req.getParameter("email");
			int quan = Integer.parseInt(req.getParameter("fquantity"));
			int fid = Integer.parseInt(req.getParameter("fid"));
			float price = Float.parseFloat(req.getParameter("fprice"));
			float tprice = Float.parseFloat(req.getParameter("tprice"));
			
			CartDaoImpl cObj = new CartDaoImpl();
			boolean b = cObj.searchCart(fname);
			
			if(!b) {
				
				boolean b1 = cdi.addCart(new Cart(fid, name, quan, email, price, tprice));
				
				if(b1) {
					resp.sendRedirect("Cart");
				}else {
					resp.sendRedirect("Fail.jsp");
				}
				
			}
			else {
				resp.sendRedirect("Cart");
			}
			
		}
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		String emailID = (String)session.getAttribute("uEmail");
		String action = req.getParameter("action");
		
		if(action!=null && action.equals("delete")) {
			int cartid = Integer.parseInt(req.getParameter("cartId"));
			boolean b = cdi.deleteCart(cartid);
			if(b) {
				resp.sendRedirect("Cart");
			}
			else {
				resp.sendRedirect("Fail.jsp");
			}
		}
		else {
			
			List<Cart>cl = cdi.ShowCart(emailID);
			if(cl!=null && !(cl.isEmpty()) ) {
				session.setAttribute("cartlist", cl);
				resp.sendRedirect("CartList.jsp");
			}
			else {
				resp.sendRedirect("Fail.jsp");
			}
		}
		
	}

}
