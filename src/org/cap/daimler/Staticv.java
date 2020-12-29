package org.cap.daimler;

public class Staticv {

	public static int age;

	public static void add() {
		System.out.println(age);
		age = 100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		System.out.println(age + 15);
	}

}
