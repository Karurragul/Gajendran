package test;
import org.cap.daimler.*;

public class Client {
	public void clientId() {
		System.out.println("9999");
	}
public void clientName() {
	System.out.println("Hari");
}

public void clientName1() {
	System.out.println("Added success");
}

public static void main(String[] args) {
	Client c = new Client();
	c.clientId();
	c.clientName();
	First a = new First();
	//method calling in different package
	// objectname.methodname();
	a.employeeId();
	a.employeename();
	// different package
	Second q = new Second();
	q.companyid();
	q.companyname();

	
}
}
