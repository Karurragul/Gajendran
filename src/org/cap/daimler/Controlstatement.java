package org.cap.daimler;

public class Controlstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// syntax : for (initialisation; condition;increase/decrease)
		for (int i = 0 ;i>5;i--) {
			/*
			 * for (int j= 0;j<3;j++) { System.out.println(j); }
			 */
			// ctrl+shift+backward slash - comment
			System.out.println(i);
			break;
			// i= 0,0<5,0,0+1 =1
			//i=1,1<5,1,1+1=2
			//i=2, 2<5,2,2+1=3
			//i=3,3<5,3,3+1=4
			//i=4,4<5,4,4+1=5
			//i=5,5<5== false
		}
	}

}
