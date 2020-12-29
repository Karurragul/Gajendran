package org.cap.daimler;

import java.util.ArrayList;
import java.util.List;

public class Company1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> l = new ArrayList<Employee>();

// assigning value to 1st employee
		Employee e1 = new Employee();
		e1.setId(100);
		e1.setName("Ragul");
		e1.setPhno(9999988888l);

//assigning value to 2nd employee
		Employee e2 = new Employee();
		e2.setId(200);
		e2.setName("gokul");
		e2.setPhno(1199988888l);

//assigning value to 3rd employee
		Employee e3 = new Employee();
		e3.setId(300);
		e3.setName("Ramu");
		e3.setPhno(2299988888l);

// Adding in list
		l.add(e1);
		l.add(e2);
		l.add(e3);

		for (int i = 0; i < l.size(); i++) {
			System.out.println("id is " + l.get(i).getId());
			System.out.println("Name is " + l.get(i).getName());
			System.out.println("Phno is " + l.get(i).getPhno());
		}

	}
}
