package CollectionEg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al = new ArrayList<String>();
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
		
		System.out.println("Before reversing");
		System.out.println(al.toString());
		
		Collections.reverse(al);
		System.out.println("After reversing");
		System.out.println(al);
	}

}
