package org.cap.daimler;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMaps {

	public static void main(String[] args) {

		Map<Integer, String> m = new LinkedHashMap<>();
		m.put(10, "Java");
		m.put(20, "Selenium");
		m.put(30, "Python");
		m.put(40, "Selenium");
		System.out.println(m);
		int size = m.size();
		System.out.println(size);
		String s = m.get(30);
		System.out.println(s);
		boolean containsKey = m.containsKey(30);
		System.out.println(containsKey);
		boolean containsValue = m.containsValue("Java");
		System.out.println(containsValue);

		// iteration
		Set<Entry<Integer, String>> e = m.entrySet();
		for (Entry<Integer, String> x : e) {
			System.out.println("output is ");
			System.out.println(x);
		}
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		Collection<String> values = m.values();
		System.out.println(values);
	}

}
