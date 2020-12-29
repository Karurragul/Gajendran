package org.cap.daimler;

public class Child implements EmployeeDetails, companydetails {
// child program
	// override
	public void compEmail() {
		System.out.println("abc@gmail.com");
	}

	// override
	public void compAddress() {
		System.out.println("Chennai");
	}

// override
	public void add() {
		System.out.println(100 + 200);
	}

//override
	public void compName() {
		System.out.println("CTS");
	}

	public static void main(String[] args) {
		Child a = new Child();
		a.add();
		a.compAddress();
		a.compEmail();
		a.compName();
	}
}
