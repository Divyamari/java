package CollectionEg;

import java.util.LinkedList;

public class ArrayListCompareEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al = new LinkedList<String>();
		al.add("Kim Namjoon");
		al.add("Kim Seok Jin");
		al.add("Min Yoongi");
		al.add("jeon hoseok");
		al.add("Park jimin");
		al.add("kim Taehyung");
		al.add("Jeon jungkook");
		System.out.println(al);
	
	LinkedList<String> al1 = new LinkedList<String>();
	al1.add("Kim Namjoon");
	al1.add("Kim Seok Jin");
	al1.add("Min Yoongi");
	al1.add("jeon hoseok");
	al1.add("Park jimin");
	al1.add("kim Taehyung");
	al1.add("Jeon jungkook");
	System.out.println(al1);
	
	boolean b = al.equals(al1);
	System.out.println(b);
	
	al1.add("Army");
	boolean b1 = al.equals(al1);
	System.out.println(b1);
	
	
	}
}
