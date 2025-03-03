package com.squad.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.squad.Pojo.Orders;
import com.squad.utility.DataConnect;

public class OrderDaoImpl implements OrderDao {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	int row;
	
	@Override
	public Orders placeOrder(String emailId) {
		
		String orderDate = new Date().toString();
		float totalPrice = 0;
		Orders o = null;
		
		try {
			
			con = DataConnect.getConnect();
			ps = con.prepareStatement("select sum(totalPrice) as total from Cart where emailID =?;");
			
			ps.setString(1, emailId);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				totalPrice = rs.getFloat("total");
				System.out.println(totalPrice);
			}
			
			if (totalPrice>0) {
				ps = con.prepareStatement("insert into Orders(emailID,totalPrice,orderDate) values(?,?,?);");
				ps.setString(1, emailId);
				ps.setFloat(2, totalPrice);
				ps.setString(3, orderDate);
				
				row = ps.executeUpdate();
				
				if(row>0) {
					ps = con.prepareStatement("select * from Orders where emailID=? and orderDate=?;");
					ps.setString(1, emailId);
					ps.setString(2, orderDate);
					
					rs = ps.executeQuery();

					
					if(rs.next()) {
						o = new Orders();
						o.setOrderID(rs.getInt("OrderID"));
						o.setEmailID(rs.getString("emailID"));
						o.setTotalPrice(rs.getFloat("totalPrice"));
						o.setOrderDate(rs.getString("orderDate"));
					
					}
				}
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}

		return o;
	}

	@Override
	public List<Orders> showOrder() {
		
		List<Orders> l = new ArrayList<Orders>();
		
		try {
			
			con = DataConnect.getConnect();
			ps = con.prepareStatement("select * from Orders;");
			rs = ps.executeQuery();
			
			if(rs.next()) {
				
				Orders o = new Orders();
				o.setOrderID(rs.getInt("OrderID"));
				o.setEmailID(rs.getString("emailID"));
				o.setTotalPrice(rs.getFloat("totalPrice"));
				o.setOrderDate(rs.getString("orderDate"));
				
				l.add(o);
			
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return l;
	}

}
