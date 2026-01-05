package com.bankingapplication;

public class EducationLoan extends Loan {
	void educationLoanDocs() {
		System.out.println("Education Loan Documents Submitted!");
		System.out.println("Documents: Admission Letter, Fee Structure, ID Proof");
	}

	@Override
	double getLoanROI() {
		return 6.8;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Education Loan Portal");

		EducationLoan el = new EducationLoan();

		if (el.validateAadhar() && el.validatePAN()) {

			int age = el.getCustomerAge();
			int cibil = el.getCibilScore();

			if (age >= 18 && cibil >= 650) {
				System.out.println("Education Loan Approved!");
				System.out.println("Interest Rate: " + el.getLoanROI());
				el.educationLoanDocs();
			} else {
				System.out.println("Education Loan Rejected.");
			}
		}
	}

}
