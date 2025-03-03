package com.squad.test;

import java.sql.Connection;

import com.squad.utility.DataConnect;


public class Test {

	public static void main(String[] args) {

		Connection con = DataConnect.getConnect();

		if(con!=null) {
			System.out.println("Database connected successfully!!!");
		}
		else {
			System.out.println("Failed to connect database.");
		}

	}

}
