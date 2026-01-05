package com.bankingapplication;

public class PersonalLoan extends Loan {
	void getPersonalLoanDocInfo() {
		System.out.println("Personal loan documents are submitted succesfully!!");
	}

	public String hello() {
		return "Java is very very very simple";
	}

	public static void main(String[] args) {

		System.out.println("Welcome to personal Loan Banking");

		// Object Creation Scenarios
		// Case 1: Child object & Child reference
		PersonalLoan p12 = new PersonalLoan();
		// Can access both parent + child methods , No restriction, Most flexible.

		// Case 2: Parent object & Parent reference
		Loan l1 = new Loan();
		// Can access only parent methods, Child methods are invisible.

		// Case 3: Child object & Parent reference (Upcasting)
		Loan l2 = new PersonalLoan();
		System.out.println(l2.hello());
		// This is UP-CASTING and This enables Dynamic Method Dispatching.
		// JVM decides which method to execute at runtime, based on the object, not
		// reference.
		// Used when: Method is overridden, Object is child, Reference is parent
		// This is the backbone of: Polymorphism, Abstraction, Loose coupling

		// Downcasting
//		PersonalLoan pl2 = (PersonalLoan) new Loan();
//		pl2.hello();
		// Compiles successfully, Fails at Runtime, Exception: ClassCastException
		// Downcasting is allowed ONLY IF object was originally a child.

		PersonalLoan p1 = new PersonalLoan();
		if (p1.validateAadhar() && p1.validateMobile() && p1.validatePAN()) {
			double salary = p1.getSalaryInfo();
			int age = p1.getCustomerAge();
			int cibil = p1.getCibilScore();
			if (salary > 1500000.00 && age >= 22 && cibil >= 750) {
				System.out.println("Congratulations !! Your loan got approved!!");
				System.out.println("Your Loan ROI is : " + p1.getLoanROI());
				System.out.println("Enter your address details: ");
				String address = p1.getAddressInfo();
				System.out.println("Verify Address again: ");
				System.out.println(address);
				p1.getPersonalLoanDocInfo();
			} else {
				System.out.println("Sorry!! Your loan got rejected!! ");
			}
		} else {
			System.out.println("Your data is incorrect it's not matching with any profile, Provide correct details.");
		}
	}

}
