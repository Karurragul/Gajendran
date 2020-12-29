package org.cap.daimler;

public class Singleinheritance extends Inheritance {

	public void companyName() {
		System.out.println("tcs");
	}

	public void companyID() {
		System.out.println("tier-1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleinheritance a = new Singleinheritance();
		a.companyID();
		a.companyName();
		a.employeeId();
		a.employeeName();
	}

}
