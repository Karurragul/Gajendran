package org.cap.daimler;

public class MultilevelInheritance extends Singleinheritance {

	public void clientId() {
		System.out.println("55555");
	}
	public void clientName() {
		System.out.println("Gajendran");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelInheritance d = new MultilevelInheritance();
		d.clientId();
		d.clientName();
		d.companyID();
		d.companyName();
		d.employeeId();
		d.employeeName();
	}

}
