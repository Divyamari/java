package adv;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		List<String> txt = new ArrayList<String>();
		txt.add("Soobin");
		txt.add("yeonjun");
		txt.add("taehyun");
		txt.add("Beomgyu");
		txt.add("kai");
		txt.forEach(display ->System.out.println(display)); //iterating with lambda expression
		txt.forEach(System.out::println); //iterating with method reference
	}
}
