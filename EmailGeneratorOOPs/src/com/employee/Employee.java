package com.employee;

import java.util.Scanner;
import java.util.Scanner;

public class Employee {
	private String firstName, lastName;
	Scanner sc = new Scanner(System.in);

	public void setfirstName() {
		System.out.println("Please Enter First Name :");
		this.firstName = sc.next();
	}

	public String getfirstName() {
		return this.firstName;
	}

	public void setlastName() {
		System.out.println("Please Enter Last Name :");
		this.lastName = sc.next();
	}

	public String getlastName() {
		return this.lastName;
	}

	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
