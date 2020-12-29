package org.cap.daimler;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// hashset-- random
		// linkedhashset - insertion
		// treeset -- ascending

		Set<Integer> i = new LinkedHashSet<>();
		i.add(10);
		i.add(20);
		i.add(30);
		i.add(10);
		System.out.println(i);

		Set<Integer> h = new HashSet<>();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(10);
		System.out.println(h);

		Set<Integer> h1 = new TreeSet<>();
		h1.add(90);
		h1.add(20);
		h1.add(30);
		h1.add(10);
		System.out.println(h1);
		for(Integer x : h1) {
			System.out.println(x);
			
		}
		
		Set<Character> h2 = new TreeSet<>();
		h2.add('1');
		h2.add('A');
		h2.add('a');
		h2.add(' ');
		h2.add('*');
		System.out.println(h1);
		for(Character x : h2) {
			System.out.println(x);
			
		}

//set<entry<>>
	}

}
