package org.cap.daimler;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserdefinedMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Employee> l = new LinkedHashMap<Integer, Employee>();

		// assigning value to 1st employee
		Employee e1 = new Employee();
		e1.setId(100);
		e1.setName("Ragul");
		e1.setPhno(9999988888l);

		// assigning value to 2nd employee
		Employee e2 = new Employee();
		e2.setId(200);
		e2.setName("gokul");
		e2.setPhno(1199988888l);

		// assigning value to 3rd employee
		Employee e3 = new Employee();
		e3.setId(300);
		e3.setName("Ramu");
		e3.setPhno(2299988888l);

//adding in map
		l.put(1, e1);
		l.put(2, e2);
		l.put(3, e3);

		Set<Entry<Integer, Employee>> entrySet = l.entrySet();

		for (Entry<Integer, Employee> x : entrySet) {
			System.out.println(x.getKey() + "employee details");
			System.out.println("Id is " + x.getValue().getId());
			System.out.println("Name is" + x.getValue().getName());
			System.out.println("phone no is" + x.getValue().getPhno());
		}}}
