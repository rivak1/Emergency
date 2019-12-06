package com.metaparking.service;

import java.sql.SQLException;
import java.util.regex.*;
import java.util.ArrayList;

import com.metaparking.dao.DaoLayer;

public class ServiceLayer {
	DaoLayer DaoLayerObj = new DaoLayer();

	void checkSql() {

	}

	public ArrayList<String> validateUserData(String name, String email,
			String organisation, String password, String passwordC,
			String gender, String contact) throws SQLException {
		ArrayList<String> errorList = new ArrayList<String>();
		if (name.length() <= 3) {
			errorList.add("size must be greter then 3");

		} else if (name.matches("^//d+$")) {
			errorList.add("digit is not allowed");
		}

		if (!(email.matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$"))) {
			errorList.add("invalid emial formate");
		}

		if ("null".equals(organisation)) {
			errorList.add("please select the Organisation");
		}

		if (password.length() < 8) {
			errorList.add("password length greter then 8");
		} else if (!password.equals(passwordC)) {
			errorList.add("password not match");
		}
		if (contact.length() != 10) {
			errorList.add("contact length must be 10");
		} 
		
		if(gender == null) {
			errorList.add("select gender");
		}

		if (errorList.size() <= 0) {
			int result = DaoLayerObj.registerUser(name, email, organisation,
					password, passwordC, gender, contact);
			if (result == 1) {
				return null;
			}
		}
		return errorList;
	}
}
