package org.test;

public class WithandWithoutVariable {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		int temp = a;
		a=b;
		b=temp;
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		int c = 20;
		int d = 30;
		System.out.println("c=" +c);
		System.out.println("d=" +d);
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println("c=" +c);
		System.out.println("d=" +d);
	}
}
