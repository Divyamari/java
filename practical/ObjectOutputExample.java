package com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Student s = new Student(012, "Divya", 3000);
			FileOutputStream fout = new FileOutputStream("E://abi.txt");
			ObjectOutputStream obj = new ObjectOutputStream(fout);
			obj.writeObject(s);
			obj.close();
			System.out.println("Done");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
