package com;
public class StaticNestedClassExample {

	static int a = 25;
	private static int b = 45;
	
	static class Inner{
		static int res;
		static void show() {
			System.out.println("value of res : "+ (a+b));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNestedClassExample.Inner.show();
	}

}
