package org.test;

public class AndOrNot {

	public static void main(String[] args) {
		int StuId = 6000, ColId = 6000;
		if(StuId <=5000 && ColId <= 6000) {
			System.out.println("Delhi University Student");
		}
		else {
			System.out.println("Other University Student");
		}
		boolean a,result;
		a = true;
		result =! a;
		System.out.println("!" + a + " = " + result);
		a = false;
		result =! a;
		System.out.println("!" + a + " = " + result);
		int age = 3,height = 130;
		if (age<=2 || height<=100) {
			System.out.println("Hall Ticket");
		}
		else {
			System.out.println("Full Ticket");
		}
	}

}
