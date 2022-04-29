package com;

public class NonStaticLocalNestedClassExample {
	int a = 25;
	private int b = 45;
	
	void display() {
	class Inner{
		 int res;
		 void show() {
			System.out.println("value of res : "+ (a+b));
		}
	}
	Inner i = new Inner();
	i.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticLocalNestedClassExample n = new NonStaticLocalNestedClassExample();
		n.display();
	}

}
