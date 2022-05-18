package CollectionEg;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> qu = new ArrayDeque<String>();
		qu.add("Felix");
		qu.add("Han");
		qu.add("Chan");
		qu.add("I.N");
		qu.add("hyunjin");
		qu.add("Lee");
		qu.add("Changbin");
		qu.add("Woojin");
		qu.add("Seungmin");
		
		for(String s: qu) {
			System.out.println(s);
		}
		qu.addFirst("Woojin");
		qu.addLast("Seungmin");
		
		System.out.println("New List");
		for(String s : qu) {
			System.out.println(s);
		}
		qu.removeFirst();
		qu.removeLast();
		
		System.out.println("New List After removal");
		for(String s : qu) {
			System.out.println(s);
		}
	}

}
