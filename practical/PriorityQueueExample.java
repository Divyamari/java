package CollectionEg;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			PriorityQueue<String> qu = new PriorityQueue<String>();
			qu.add("Felix");
			qu.add("Han");
			qu.add("Chan");
			qu.add("I.N");
			qu.add("hyunjin");
			qu.add("Lee");
			qu.add("Changbin");
			qu.add("Woojin");
			qu.add("Seungmin");
			
			System.out.println("Peek Element : " + qu.peek());
			
			Iterator itr = qu.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			qu.remove();
			System.out.println("Queue after removing an element");
			Iterator itr1 = qu.iterator();
			while (itr1.hasNext()) {
				System.out.println(itr1.next());
	}
	}
}
