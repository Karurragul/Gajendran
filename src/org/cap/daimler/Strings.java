package org.cap.daimler;

public class Strings{

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
//ragul == length -5
		// index  = 4 i.e. index= length-1
		String s ="  sandhiya   balaji  ";
		String s1 ="iiiandhiya";
		//substring
		
		String g ="Hai Welcome to java class";
		String substring = g.substring(4);
		System.out.println(substring);
		String substring2 = g.substring(4, 11);
		System.out.println(substring2);
	//cts@1234 -- tcs@1234
		
		boolean equals = s.equals(s1);
		System.out.println(equals);
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		System.out.println(equalsIgnoreCase);
		
		// trim
		String trim = s.trim();
		System.out.println(trim);
		
		//concat
		String concat = s.concat(s1);
		System.out.println(concat);
		//         012345678910 
		//to find length
		int i = s.length();
		System.out.println(i);
		//to find particular character
		char c = s.charAt(5);
		System.out.println(c);
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		/*
		 * //starts-with boolean startsWith = s.startsWith("san");
		 * System.out.println(startsWith);
		 * 
		 * //ends-with
		 * 
		 * boolean endsWith = s.endsWith("ya   "); System.out.println(endsWith);
		 * 
		 * //to find index int indexOf = s.indexOf("h"); System.out.println(indexOf);
		 * 
		 * int indexOf2 = s.indexOf("balaji"); System.out.println(indexOf2);
		 * 
		 * int lastIndexOf = s.lastIndexOf("a"); System.out.println(lastIndexOf);
		 */	
		//replace
	String replace = s.replace('a', 'v');
	System.out.println(replace);
	
	
		
		
	}

}
