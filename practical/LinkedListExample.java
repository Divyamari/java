package CollectionEg;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al = new LinkedList<String>();
		al.add("Kim Namjoon");
		al.add("Haters");
		al.add("Min Yoongi");
		al.add("jeon hoseok");
		al.add("Park jimin");
		al.add(1,"Kim Seok Jin");
		al.add("kim Taehyung");
		al.addFirst("Bantan Boys");
		al.add("Jeon jungkook");
		al.addLast("BTS");
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		al.removeLast();
		al.removeFirst();
		al.remove(2);
		
		System.out.println("List after removal");
		Iterator<String> itr1 = al.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
	}
		
		System.out.println("List in reverse order");
		Iterator<String> itrr = al.descendingIterator();
		while(itrr.hasNext()) {
			System.out.println(itrr.next());
}
}
}
