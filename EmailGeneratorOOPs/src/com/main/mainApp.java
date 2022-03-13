/* Authour: Jeyachithra Balaraman*/
package com.main;

// importing other two packages used in this project
import com.credentialService.*;
import com.employee.*;
import java.util.InputMismatchException;
import java.util.Scanner;

//main method
public class mainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// variable declaration
		int option;
		String firstName, lastName, dept, username, email, password;
		// Input Name
		System.out.println("Welcome to ABC Company");
		System.out.println("----------------------");
		// for using Employee constructor as mentioned in requirements
		Employee obj = new Employee("", "");
		obj.setfirstName();
		obj.setlastName();
		firstName = obj.getfirstName();
		lastName = obj.getlastName();
		username = firstName + lastName;
		// Input Department
		System.out.println("Please Select Department");
		System.out.println("------------------------");
		System.out.println("1. Technical Department");
		System.out.println("2. Admin Department");
		System.out.println("3. Human Resource Department");
		System.out.println("4. Legal Department");
		try {
			option = sc.nextInt();
		} catch (InputMismatchException e) {
			option = 0;
			System.err.println("Invalid Data - Enter number 1-4 :" + e.getMessage());
		}
		dept = "";
		switch (option) {
		case 1:
			dept = "tech";
			break;
		case 2:
			dept = "adm";
			break;
		case 3:
			dept = "hr";
			break;
		case 4:
			dept = "legal";
			break;
		default:
			System.out.println("Enter valid input");
			break;
		}

		// using CredentialService to generate email,password,printing the required
		// output generation only if option is 1-4
		if (dept != "") {
			CredentialService obj1 = new CredentialService();
			email = obj1.generateEmailAddress(username, dept);
			password = obj1.generatePassword();
			obj1.showCredentials(firstName, email, password);
		}
		sc.close();
	}
}