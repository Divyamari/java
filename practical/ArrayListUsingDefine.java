package CollectionEg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListUsingDefine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank(123,"Divya", 10000.58, 25);
		Bank b1 = new Bank(123,"Abi", 20000.65, 25);
		Bank b2 = new Bank(123,"Logi",5000.63, 25);
		Bank b3 = new Bank(123,"Mohan", 40000.25, 25);
		Bank b4 = new Bank(123,"Mari", 35000.83, 25);
		
		//creating arraylist
		ArrayList<Bank> al = new ArrayList<Bank>();
		al.add(b4);
		al.add(b);
		al.add(b3);
		al.add(b1);
		al.add(b2);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			Bank obj = (Bank) itr.next();
			System.out.println(obj.accountNo+ " " + obj.customerName + " " + obj.Balance + " " + obj.customerAge);;
		}
		Collections.sort(al);
		for(Bank ba:al) {
			System.out.println(ba.accountNo+ " " + ba.customerName + " " + ba.Balance + " " + ba.customerAge);;
		}
	}
}
public class Bank implements Comparable<Bank>{
	
	long accountNo;
	String customerName;
	double Balance;
	int customerAge;
	
	public Bank(long accountNo, String customerName, double Balance, int customerAge) {
		super();
		this.accountNo = accountNo;
		this.customerName = customerName;
		this.Balance = Balance;
		this.customerAge = customerAge;
}
	public int compareTo(Bank b) {
		if(customerAge == b.customerAge)
			return 0;
		else if (customerAge > b.customerAge)
			return 1;
		else
			return -1;
	}
}

