package com;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream f = new FileOutputStream("E:\\test.txt");
			//f.write(121);
			
			String s = "Welcome to Anudip Foundation";
			byte b[] = s.getBytes();
			f.write(b);
			f.close();
			
			System.out.println("done");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
