package org.cap.daimler;

public class Company implements Fully1 {
	
	public void add() {
		int a = 10,b=20,c;
		c=a+b;
		System.out.println(c);
	}

	public void compName() {
		System.out.println("CTS");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company a = new Company();
		a.compName();
		a.add();
	}

}
