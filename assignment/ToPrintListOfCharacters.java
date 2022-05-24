package adv;

import java.util.ArrayList;
import java.util.List;

public class ToPrintListOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List < String > list = new ArrayList < String > ();
		  list.add("rabbit");
		  list.add("bribe");
		  list.add("dog");
		  System.out.print("The given strings are: ");
		  for (int i = 0; i < list.size(); i++) {
		   System.out.print(list.get(i) + " ");
		  }
		  System.out.println("The given word is: bib ");
		  System.out.println("\nThe strings containing all the letters of the given word are: ");
		  for (int j = 0; j < list.size(); j++) {
		   checkExistance(list.get(j), "bib");
		  }

}

	private static void checkExistance(String string, String string2) {
		// TODO Auto-generated method stub
		 int chk = 0;
		  char chhr = ' ';
		  int[] a = new int[Character.MAX_VALUE + 1];

		  for (int i = 0; i < string.length(); i++) {
		   chhr = string.charAt(i);
		   ++a[chhr];
		  }
		  for (int i = 0; i < string2.length(); i++) {
		   chhr = string2.charAt(i);
		   if (a[chhr] >= 1)
		    chk = 1;
		  }
		  if (chk == 1)
		   System.out.println(string);
		 }

}
