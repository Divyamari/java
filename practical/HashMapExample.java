package CollectionEg;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<Integer, String>();
		map.put(101, "Lisa");
		map.put(107,"Jisoo");
		map.put(105,"Rose");
		map.put(109,"Jennie");
		map.put(105,"Rose");//duplicate entry
		map.put(null, null);//null entry
		map.put(103, null);//null value
		//map.put(null, "Blink");
		map.putIfAbsent(103,"Blink");//103 was mapped with value
		map.putIfAbsent(105, "BlackPink");//105 is already mapped with a value
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		map.remove(103);
		System.out.println("After removal");
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
