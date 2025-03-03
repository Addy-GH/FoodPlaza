package com.squad.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;
import com.squad.Dao.OrderDaoImpl;
import com.squad.Pojo.Cart;
import com.squad.Pojo.Orders;

public class OrderTest {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		OrderDaoImpl odi = new OrderDaoImpl();
		
		String emailID;
		
		while(true) {
			
			System.out.println("\n1.PlaceOrder\n2.ShowOrder");

			System.out.print("\nEnter the choice: ");
			int choice = sc.nextInt();
			
			boolean b;
			switch (choice) {
			case 1:
				
				System.out.println("Enter an existing emailID :  ");
				emailID = br.readLine();
				
				Orders o = odi.placeOrder(emailID);
				
				if ( o != null) {
					System.out.println(o);
				}else {
					System.out.println("Failed to place order");
				}
				
				
				
				break;
				
				
			case 2: 
				
				System.out.println("Showing Order");
				
				List<Orders> l = odi.showOrder();
				
				Iterator<Orders> oi = l.iterator();
				
				while(oi.hasNext()) {
					System.out.println(oi.next());
				}
				
				
				
				
				
				
				
				break;
				

			default:
				break;
			}
			
			
			
		}
		
		
		
		
		
	}

}
