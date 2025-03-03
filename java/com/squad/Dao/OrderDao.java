package com.squad.Dao;

import java.util.List;


import com.squad.Pojo.Orders;

public interface OrderDao {
	
	Orders placeOrder (String emailId);
	List<Orders> showOrder();

}
