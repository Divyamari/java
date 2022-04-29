package com;

public class NonStaticNestedClassExample {
	int a = 25;
	private int b = 45;
	
	class Inner{
		 int res;
		 void show() {
			System.out.println("value of res : "+ (a+b));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticNestedClassExample c = new NonStaticNestedClassExample();
		NonStaticNestedClassExample.Inner i = c.new Inner();
		i.show();
	}

}
