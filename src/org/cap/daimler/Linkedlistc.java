package org.cap.daimler;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Ragul");
		ll.add("Vijay");
		ll.add("Ajay");

		System.out.println(ll);

		LinkedList<String> dd = new LinkedList<String>();
		dd.add("Ravi");
		dd.add("vijay");
		dd.add("Ajay");
		System.out.println(dd);
		dd.add(1, "Dhanush");
		System.out.println(dd);
		dd.add(1, "Ajith");
		System.out.println(dd);
		
	
	}

}
