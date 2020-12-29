package org.cap.daimler;

public class Empl {
//constructor chaining
	public Empl() {
		this(19);
		System.out.println("default constructor");
	}

	public Empl(int id) {
		this("Ragul");
		System.out.println("int para constructor" + id);
	}

	public Empl(String name) {
		// TODO Auto-generated constructor stub
		this("Ram", 123456789l);
		System.out.println("String para constructor" + name);
	}

	public Empl(String name, long phone) {
		// TODO Auto-generated constructor stub
		System.out.println("String long para constructor" + name + "\t" + phone);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empl a = new Empl();
	}

}
