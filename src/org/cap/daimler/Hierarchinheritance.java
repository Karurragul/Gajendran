package org.cap.daimler;

public class Hierarchinheritance extends Inheritance {

	public void companylocation() {
		System.out.println("chennai");
	}
	public void headquarter() {
		System.out.println("mumbai");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierarchinheritance n = new Hierarchinheritance();
		n.companylocation();
		n.headquarter();
		n.employeeId();
		n.employeeName();
	}

}
