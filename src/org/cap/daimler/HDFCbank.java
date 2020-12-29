package org.cap.daimler;

public class HDFCbank extends ICICIbank {

	public void fixed() {
		System.out.println("10% interest");
	}

	// method override
	public void deposits(int id) {
		System.out.println("8% interest" +"\t"+ id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFCbank a = new HDFCbank();
		a.deposits(5000);
		a.fixed();
		a.savings();
		a.deposits(8000);
	}

}
