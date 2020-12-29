package org.cap.daimler;

import java.util.ArrayList;

public class Arraylistc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> li = new ArrayList<>();
		li.add(10);
		li.add("20");
		li.add('3');
		li.add(40l);
		li.add(50f);
		li.add(10);
		System.out.println(li);
		// size of list
		int size = li.size();
		System.out.println(size);
		Object i = li.get(4);
		System.out.println(i);
		li.add(4, 90);
		System.out.println(li);
		li.remove(4);
		System.out.println(li);
		int k = li.indexOf('3');
		System.out.println(k);
		int g = li.lastIndexOf(10);
		System.out.println(g);

		boolean empty = li.isEmpty();
		System.out.println(empty);

		ArrayList<Object> si = new ArrayList<>();
		si.addAll(li);
		si.add(60);
		si.add(4, 77);
		si.add(90);
		System.out.println(si);

		// retainAll i.e intersection
		si.retainAll(li);
		System.out.println(si);

		// contain
		boolean contains = li.contains(40l);
		System.out.println(contains);
		
		//iteration
		
		//("iterate using normal for loop");
		for (int p = 0; p < li.size(); p++) {
			System.out.println(li.get(p));
		}
		System.out.println("iterate using extended for loop");
		for (Object x : li) {
			System.out.println(x);
		}
	}
	}
