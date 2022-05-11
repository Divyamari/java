package com;

import java.io.ByteArrayInputStream;

public class ByteArrayInputSreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte [] arr = {55, 95, 56, 79, 39};
		
		ByteArrayInputStream bin = new ByteArrayInputStream(arr);
		
		int i =0;
		while ((i = bin.read()) != -1) {
			char ch = (char)i;
			System.out.println("ASCII Character" + i + "value is " + ch);
		}
	}

}
