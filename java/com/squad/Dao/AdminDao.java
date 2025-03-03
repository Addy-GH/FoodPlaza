package com.squad.Dao;

public interface AdminDao {
	
	boolean admin(String adminEmailId, String adminPassword  );
	boolean adminChangePassowrd(String adminEmailId, String adminPassword);
	boolean userLogin(String customerEmaild, String customerPassword);
	boolean userChangePassword(String customerEmailId, String customerPassword);

}
