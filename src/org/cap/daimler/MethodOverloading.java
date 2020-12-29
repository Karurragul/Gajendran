package org.cap.daimler;

public class MethodOverloading {
	// depends on datatype
	public void dataBase(int id) {
		System.out.println(id);
	}

//depends on datatype order
	public void dataBase(int empid, String name) {
		System.out.println("My emp id and name is " + empid + "\t" + name);
	}

	// depends on datatype count
	public void dataBase(float salary, String email, char block) {
		System.out.println("My salary, email and block is" + salary + "\t" + email + "\t" + block);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading d = new MethodOverloading();
		d.dataBase(1234);
		d.dataBase(5678, "gajendran");
		d.dataBase(65000.50f, "abc@gmail.com", 'A');
	}

}
