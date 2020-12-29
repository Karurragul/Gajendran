package org.cap.daimler;

public class Literal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Ragul";
		String s2 = "Prabhu";
		// literal string
		System.out.println("Immutable string");

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		String s = s1.concat(s2);
		System.out.println(s);
		System.out.println(System.identityHashCode(s));

		// non-literal
		StringBuffer x1 = new StringBuffer("Ragul");
		StringBuffer x2 = new StringBuffer("Prabhu");
		System.out.println("mutable string");
		System.out.println(System.identityHashCode(x1));
		System.out.println(System.identityHashCode(x2));
		x1.append(x2);
		System.out.println(x1);
		System.out.println(System.identityHashCode(x1));

	}

}
