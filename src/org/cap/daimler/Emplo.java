package org.cap.daimler;
// parent
public class Emplo extends Supers {
	public Emplo() {
		super(100);
		System.out.println("default constructor");
	}

	public Emplo(int id) {
		System.out.println("int para constructor" + id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emplo a = new Emplo();
		Emplo a1 = new Emplo(123);
	}

}
