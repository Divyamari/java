package CollectionEg;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUsingUserdefineClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayBank b = new ArrayBank(123,"Divya", 10000.58, 25);
		ArrayBank b1 = new ArrayBank(123,"Abi", 20000.65, 25);
		ArrayBank b2 = new ArrayBank(123,"Logi",5000.63, 25);
		ArrayBank b3 = new ArrayBank(123,"Mohan", 40000.25, 25);
		ArrayBank b4 = new ArrayBank(123,"Mari", 35000.83, 25);
		
		//creating arraylist
		ArrayList<ArrayBank> al = new ArrayList<>();
		al.add(b4);
		al.add(b);
		al.add(b3);
		al.add(b1);
		al.add(b2);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			ArrayBank obj = (ArrayBank) itr.next();
			System.out.println(obj.accountno+ " " + obj.customername + " " + obj.balance + " " + obj.customerage);;
		}
	}

}
public class ArrayBank {
	long accountno;
	String customername;
	double balance;
	int customerage;
	
	public ArrayBank(long accountno, String customername, double balance, int customerage) {
		this.accountno;
		this.customername;
		this.balance;
		this.customerage;
		
	}

}

