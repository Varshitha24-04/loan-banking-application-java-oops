package com.bankingapplication;

public class CarLoan extends Loan {
	void carLoanDocuments() {
		System.out.println("Car Loan Documents Submitted Successfully!");
		System.out.println("Documents: RC Book, Insurance, Salary Slip");
	}

	@Override
	double getLoanROI() {
		return 9.2;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Car Loan Portal");

		CarLoan cl = new CarLoan();

		if (cl.validateAadhar() && cl.validatePAN() && cl.validateMobile()) {

			int age = cl.getCustomerAge();
			double salary = cl.getSalaryInfo();
			int cibil = cl.getCibilScore();

			if (age >= 21 && salary >= 250000 && cibil >= 700) {
				System.out.println("Car Loan Approved!");
				System.out.println("Interest Rate: " + cl.getLoanROI());
				cl.carLoanDocuments();
			} else {
				System.out.println("Car Loan Rejected.");
			}
		}
	}
}
