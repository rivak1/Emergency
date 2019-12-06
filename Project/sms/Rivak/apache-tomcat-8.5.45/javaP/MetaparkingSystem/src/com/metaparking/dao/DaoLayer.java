package com.metaparking.dao;

import java.sql.SQLException;

public class DaoLayer {

	public int registerUser(String name, String email, String organisation,
			String password, String passwordC, String gender, String contact) throws SQLException {
		
		String query = "INSERT INTO User(full_name , Email_Id , Organisation, Password , Gender ,Contact_number)VALUES('" + name + "','" + email +
				"','" + organisation + "','" + password + "','" + gender + "','" + contact + "');";
		System.out.println(query);
		int result =SqlConnector.executeUpdateQuery(query);
		return result;
	}

}
