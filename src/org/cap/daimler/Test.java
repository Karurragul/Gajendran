package org.cap.daimler;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "welcome to java";
		String[] x = name.split("");
		String res = "";
		char firstchar = name.charAt(0);
		char uppercase = Character.toUpperCase(firstchar);
		
		//for (String v : x) {
		//	System.out.println(uppercase);
		//	System.out.println(firstchar);
			String rem = name.substring(1, name.length());
//append
			res = firstchar+rem;
		
		//trim
		System.out.println(res);
	}}
