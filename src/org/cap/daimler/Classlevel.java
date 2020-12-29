package org.cap.daimler;

public class Classlevel {

	public int age;
	public String name;

	public void add() {
		System.out.println(age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classlevel c = new Classlevel();
		c.add();
		System.out.println(c.age + 15);
	}

}
