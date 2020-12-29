package org.cap.daimler;

public class First {
	// methods
	public void employeeId() {
		// logic
		System.out.println("1234");
	}

//method
	public void employeename() {
		// logic
		System.out.println("Gajendran");
	}

	// execution starts from main method
	public static void main(String[] args) {
		// object creation
		// classname objectname = new classname();
		First a = new First();
		//method calling
		// objectname.methodname();
		a.employeeId();
		a.employeename();
	}
		
	}
