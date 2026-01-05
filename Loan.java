package com.bankingapplication;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Loan {
	static Scanner sc = new Scanner(System.in);

	String getAddressInfo() {
		String address = " ";
		System.out.println("Enter flat number");
		String flat = sc.next();
		System.out.println("Enter plot number");
		String plot = sc.next();
		System.out.println("Enter street name");
		String street = sc.next();
		System.out.println("Enter City");
		String city = sc.next();
		System.out.println("Enter pincode");
		long pin = sc.nextLong();

		address = "Flat No: " + flat + ", Plot Details: " + plot + ", Street name  : " + street + ", City: " + city
				+ ", PinCode: " + pin;
		return address;
	}

	boolean validateAadhar() {
		System.out.println("Enter Aadhaar Number: ");
		String aadhar = sc.next();

		String aadharRegex = "^[2-9][0-9]{11}$";
		return Pattern.matches(aadharRegex, aadhar);
	}

	boolean validatePAN() {
		System.out.println("Enter PAN Number: ");
		String pan = sc.next();

		String panRegex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
		return Pattern.matches(panRegex, pan);
	}

	boolean validateMobile() {
		System.out.println("Enter Mobile Number: ");
		String mobile = sc.next();
		String mobileRegex = "[6-9][0-9]{9}";
		return Pattern.matches(mobileRegex, mobile);
	}

	int getCustomerAge() {
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		return age;
	}

	double getLoanROI() {
		return 10.5;
	}

	int getCibilScore() {
		System.out.println("Enter Cibil Score:");
		int cibil = sc.nextInt();
		return cibil;

	}

	double getSalaryInfo() {
		System.out.println("Enter your salary info: ");
		double salary = sc.nextDouble();
		return salary;
	}

	public String hello() {
		return "Java is simple";
	}
}
