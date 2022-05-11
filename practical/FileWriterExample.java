package com;

import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("E://test.txt");
			fw.write("Welcome to Anudip Foundation Skill Developement centre");
		}catch(Exception e) {
			System.out.println(e);
		}
		fw.close();
		
		System.out.println("Done");
	
	}

}
