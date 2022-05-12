package CollectionEg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> al = new ArrayList<String>();
		
		//adding the object to arraylist
		al.add("rose");
		al.add("Sunflower");
		al.add("Rose");
		al.add(0,"Lilly");
		al.add(2,"Daisy");
		al.add("Marigold");
		al.add(6,"Tulip");
		al.add("Jasmine");
		al.add("Orchid");
		al.add("Lotus");
		al.add(5,"Lavender");
		
		System.out.println("Traversing using for loop");
		for(int i = 0; i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("Traversing using for each loop");
		for(String i:al) {
			System.out.println(i);
		}
		System.out.println("Traversing using iterator");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("traversing using iterator - forward");
		ListIterator<String> itr1 = al.listIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
	    System.out.println("traversing using iterator - backward");
		ListIterator<String> itr2 = al.listIterator();
		while(it.hasPrevious()) {
			System.out.println(itr2.previous());
		}
	}

}
