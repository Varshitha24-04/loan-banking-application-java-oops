package com.bankingapplication;

public class GoldLoan extends Loan {

	void goldLoanDocs() {
		System.out.println("Gold Loan Documents Submitted!");
		System.out.println("Documents: Gold Purity Certificate, ID Proof");
	}

	@Override
	double getLoanROI() {
		return 7.5;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Gold Loan Portal");

		GoldLoan gl = new GoldLoan();

		if (gl.validateAadhar() && gl.validateMobile()) {

			int cibil = gl.getCibilScore();

			if (cibil >= 600) {
				System.out.println("Gold Loan Approved!");
				System.out.println("Interest Rate: " + gl.getLoanROI());
				gl.goldLoanDocs();
			} else {
				System.out.println("Gold Loan Rejected.");
			}
		}
	}

}
