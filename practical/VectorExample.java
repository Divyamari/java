package CollectionEg;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vc = new Vector<String>();
		vc.add("BTS");
		vc.add("TXT");
		vc.add("Enhypen");
		vc.add("Straykids");
		vc.add("Got7");
		vc.add("Shinee");
		vc.add("EXO");
		
		System.out.println(vc);
		
		if(vc.contains("BTS")) {
			System.out.println("Element Present");
	}
	else
		System.out.println("not Present");
	}

}
