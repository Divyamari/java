package CollectionEg;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		
		boolean b = st.empty();
		System.out.println(b);
		
		try {
			st.pop();
		}
		catch(EmptyStackException e) {
			System.out.println("empty stack" +e);
		}
		
		st.push(90);
		st.push(54);
		st.push(64);
		st.push(74);
			System.out.println(st);
	
		st.push(64);
		st.push(20);
			System.out.println(st);
		
		Integer i = st.peek();
		System.out.println("top element :" +i);
		 
		st.pop();
		System.out.println(st);
		
		int j = st.search(74);
		System.out.println("position is " +i);
	
	  
	}
}
