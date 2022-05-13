package CollectionEg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayToArrayListEg {

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
		
		System.out.println("List to array");
		String [] arr = al.toArray(new String[al.size()]);
		for(String s : arr) {
			System.out.println(s);
		}
		
		System.out.println("Array to List");
		List<String> all = new ArrayList<String>();
		all = Arrays.asList(arr);
		System.out.println(all);
	}

}
