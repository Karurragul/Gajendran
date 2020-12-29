package org.cap.daimler;

public class Emp {
	// classname and constructor name must be same
	public Emp() {
		System.out.println("Default constructor");
	}
	public Emp(int para) {
		System.out.println("int para constructor"+para);
	}
	
	public void Emp() {
		System.out.println("Method");
	}
	public static void main(String[] args) {
		Emp a = new Emp(); // constructor not classname
		Emp a1 = new Emp(100);
		a1.Emp();
	}

}
