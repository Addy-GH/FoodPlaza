package com.squad.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.squad.utility.DataConnect;

public class AdminDaoImpl implements AdminDao {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	@Override
	public boolean admin(String adminEmailId, String adminPassword) {

		try {

			con = DataConnect.getConnect();
			ps = con.prepareStatement("Select * from Admin where adminEmailID=? and adminPassword=?");
			ps.setString(1, adminEmailId);
			ps.setString(2, adminPassword);

			rs = ps.executeQuery();

			if (rs.next()) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean adminChangePassowrd(String adminEmailId, String adminPassword) {

		try {

			con = DataConnect.getConnect();
			ps = con.prepareStatement("update Admin set adminPassword=? where adminEmailId=?;");
		
			ps.setString(1, adminPassword);
			
			ps.setString(2, adminEmailId);
			int row = ps.executeUpdate();

			if (row > 0) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean userLogin(String customerEmaild, String customerPassword) {
	
		try {

			con = DataConnect.getConnect();
			ps = con.prepareStatement("Select * from Customer where customerEmailID=? and customerPassword=?");
			ps.setString(1, customerEmaild);
			ps.setString(2, customerPassword);

			rs = ps.executeQuery();

			if (rs.next()) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	 public boolean userChangePassword(String customerEmailId, String customerPassword) {
		  
		  try {

		   con = DataConnect.getConnect();
		   ps = con.prepareStatement("update Customer set customerPassword=? where customerEmailId=?;");
		  
		   ps.setString(1, customerPassword);
		   
		   ps.setString(2, customerEmailId);
		   int row = ps.executeUpdate();

		   if (row > 0) {
		    return true;
		   }

		  } catch (Exception e) {
		   e.printStackTrace();
		  }
		  
		  return false;
		 }

}
