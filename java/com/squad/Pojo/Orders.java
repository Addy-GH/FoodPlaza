package com.squad.Pojo;

public class Orders {
	
	private int orderID;
	private String emailID;
	private String orderDate;
	private float totalPrice;
	
	
	
	public Orders(int orderID, String emailID, String orderDate, float totalPrice) {
		super();
		this.orderID = orderID;
		this.emailID = emailID;
		this.orderDate = orderDate;
		this.totalPrice = totalPrice;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Orders: Order-ID = " + orderID  + " Email-ID = " + emailID + ", Order Date = "
				+ orderDate + ", Total Price = " + totalPrice + ".";
	}

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

}
