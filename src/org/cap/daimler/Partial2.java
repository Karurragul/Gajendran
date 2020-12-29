package org.cap.daimler;

public class Partial2 extends Partial1 {
//override
	public  void empId() {
		System.out.println("123456");
	}
	
	public void empEmail() {
		System.out.println("abc@gmail.com");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Partial2 c = new Partial2();
		c.empEmail();
		c.empId();
		c.empName();
	}

}
