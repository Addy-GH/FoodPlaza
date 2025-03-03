package com.squad.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.squad.Dao.AdminDaoImpl;
import com.squad.Pojo.Admin;

public class AdminTest {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String adminEmailId, adminPassword;
		
		AdminDaoImpl adi = new AdminDaoImpl();
		List<Admin> l = new ArrayList<>();
		
		while(true) {
			
			System.out.println("1.AdminLogin\n2.ChangeAdminPassword\n3.UserLogin\n.4.ChangeUserPassword");
			
			System.out.println("Enter the choice : ");
			int choice = sc.nextInt();
			
			boolean b;
			
			switch (choice) {
			case 1:
				
				System.out.println("Enter the admin email id : ");
				adminEmailId = br.readLine();
				System.out.println("Enter the admin email password : ");
				adminPassword = br.readLine();
				
				b = adi.admin(adminEmailId, adminPassword);
				
				if(b) {
					System.out.println("Succesfully login");
				}
				else {
					System.out.println("Failed to login");
				}
				
				break;
				
			case 2:
				
				System.out.println("Enter the admin email id : ");
				adminEmailId = br.readLine();
				System.out.println("Enter the admin email password : ");
				adminPassword = br.readLine();
				
				b = adi.adminChangePassowrd(adminEmailId, adminPassword);
				
				if(b) {
					System.out.println(" Changed Succesfully");
				}
				else {
					System.out.println("Failed to change");
				}
				
				break;
			case 3 : 
		        
		        System.out.print("Enter Customer  Email-id: ");
		        adminEmailId = br.readLine();
		        
		        System.out.print("Enter Customer Password: ");
		        adminPassword = br.readLine();
		        
		        b = adi.userLogin(adminEmailId, adminPassword);
		        
		        if(b) {
		          System.out.println("\nLogin successfully.");
		        }
		        else {
		          System.out.println("\nFailed to Login.");
		        }  
		        
		        break;
		      
		      case 4 : 

		        System.out.print("Enter Customer's Existing Email-id: ");
		        adminEmailId = br.readLine();
		        
		        System.out.print("Enter Customer's New Password: ");
		        adminPassword = br.readLine();
		        
		        b = adi.userChangePassword(adminEmailId, adminPassword);
		        
		        if(b) {
		          System.out.println("\nPassword Changed successfully.");
		        }
		        else {
		          System.out.println("\nFailed to Change Password.");
		        }
		        
		        break;

		      default :

		        System.out.println("You entered something wrong!!!");

		        break;

		      }
			
			
			
		}
		
		
	}

}
