package com;

import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("E://test.txt");
		int i ;
		while((i = fr.read())!=-1) {
			System.out.println((char) i);
		}
		fr.close();
		
		System.out.println("Done");
	}catch(Exception e) {
		System.out.println(e);
	}

}
