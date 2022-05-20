package adv;

import java.util.Optional;

public class OptionalClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String[5];
	//	str[3] = "anudip";
		
		Optional<String> c = Optional.ofNullable(str[3]);
	/*	if(c.isPresent()) {
		String l = str[3].toUpperCase();
		System.out.println(l);
	}
		else {
			System.out.println("value not there");
		}*/
		System.out.println(c.isPresent());
		System.out.println(c.orElse("value is not present"));	}
}
