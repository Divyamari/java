package CollectionEg;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating arraylist
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

		//printing arrylist objects
		System.out.println(al);
		System.out.println("Size of arrayList : " +al.size());
		
		//Removing elements at index 5
		al.remove(5);
		System.out.println(al);
		System.out.println("Size of arrayList : " +al.size());

		al.add("Lavender");
		al.add("Lotus");
		System.out.println(al);
		System.out.println("Size of arrayList : " +al.size());
		System.out.println("Element of index value is : " +al.get(6));
	}

}
