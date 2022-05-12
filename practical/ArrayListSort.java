package CollectionEg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> al = new ArrayList<String>();
		
		//adding the object to arraylist
		al.add("rose");
		al.add("Sunflower");
		al.add("Rose");
		al.add("Lilly");
		al.add("Daisy");
		al.add("Marigold");
		al.add("Tulip");
		al.add("Jasmine");
		al.add("Orchid");
		al.add("Lotus");
		al.add("Lavender");
		//sorting al
		Collections.sort(al);
		for(String a : al) {
			System.out.println(a);
		}
		
		List<Integer>al1 = new ArrayList<Integer>();
		al1.add(20);
		al1.add(80);
		al1.add(58);
		al1.add(82);
		al1.add(65);
		al1.add(47);
		al1.add(28);
		System.out.println("Integer sorted List");
		//sorting al1 in ascending
		Collections.sort(al1);
		for (Integer i : al1) {
			System.out.println(i);
		}
		//sorting in descending
		Collections.reverse(al1);
		System.out.println(al1);
	}

}
