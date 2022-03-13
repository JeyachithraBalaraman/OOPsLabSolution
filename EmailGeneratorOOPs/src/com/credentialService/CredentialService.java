package com.credentialService;

import com.employee.*;
import com.main.*;
import java.util.Random;

public class CredentialService {
	String name, dept, password, firstName, email;

//generating email
	public String generateEmailAddress(String name, String dept) {
		email = name + "@".concat(dept) + ".abc.com";
		return email;
	}

// generating password
	public String generatePassword() {
		String[] randomSelection = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
				"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" , "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
				"q", "r", "s", "t", "u", "v", "w", "x", "y", "z" , "0", "1", "2", "3", "4", "5", "6", "7", "8", "9","@", "*", "$", "#", "!", "%", "&" };
		Random random = new Random();
		password = "";
		int j;
		for (int i = 0; i <= 7; i++) {
			j = random.nextInt(randomSelection.length);
			password = password + randomSelection[j];
		}
		return password;
	}

// to display the required output
	public void showCredentials(String firstName, String email, String password) {
		System.out.println("Dear " + firstName + "  your generated credentials are as follows- ");
		System.out.println("Email  --------> " + email);
		System.out.println("Password ------>" + password);

	}

}
