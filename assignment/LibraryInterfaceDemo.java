package org.test;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	KidsUser ku = new KidsUser();
	ku.registerAccount();
	ku.requestBook();
	
	AdultUser au = new AdultUser();
	au.registerAccount();
	au.requestBook();
		
	}

}
