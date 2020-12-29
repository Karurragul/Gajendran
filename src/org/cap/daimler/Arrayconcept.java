package org.cap.daimler;

public class Arrayconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 60;
		a[3] = 39;
		a[4] = 40;
		System.out.println(a[2]);
		int l = a.length;
		System.out.println(l);
		System.out.println("iterate using normal for loop");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("iterate using extended for loop");
		for (int x : a) {
			System.out.println(x);
		}
	}

}
