package com.bankingapplication;

public class HomeLoan extends Loan {

	void homeLoanDocuments() {
		System.out.println("Home Loan Documents Submitted Successfully!");
		System.out.println("Documents: Salary Slip, Property Papers, ID Proof");
	}

	@Override
	double getLoanROI() {
		return 8.5;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Home Loan Portal");

		HomeLoan hl = new HomeLoan();

		if (hl.validateAadhar() && hl.validatePAN() && hl.validateMobile()) {

			int age = hl.getCustomerAge();
			double salary = hl.getSalaryInfo();
			int cibil = hl.getCibilScore();

			if (age >= 25 && salary >= 300000 && cibil >= 750) {
				System.out.println("Home Loan Approved!");
				System.out.println("Interest Rate: " + hl.getLoanROI());
				System.out.println(hl.getAddressInfo());
				hl.homeLoanDocuments();
			} else {
				System.out.println("Home Loan Rejected due to eligibility criteria.");
			}

		} else {
			System.out.println("Invalid KYC Details.");
		}
	}

}
