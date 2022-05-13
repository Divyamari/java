package CollectionEg;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<String>();
		s.add("BlackPink");
		s.add("Twice");
		s.add("RedVelvet");
		s.add("Mamamo");
		s.add(null);
		s.add("GirlsGeneration");
		s.add("ITZY");
		s.add("GFriends");
		s.add(null);
		s.add("2NE1");
		
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		s.remove("GirlsGeneration");
				System.out.println(itr.next());
	}

}
