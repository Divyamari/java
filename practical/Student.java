package com;

import java.io.Serializable;

public class Student implements Serializable {
	
	int id;
	String sname;
	transient int fees;//will not get serialized
	
	public Student(int id, String sname, int fees) {
		this.id = id;
		this.sname = sname;
		this.fees = fees;
	}

}
