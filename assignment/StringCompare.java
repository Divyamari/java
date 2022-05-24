package adv;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Stephen Edwin King";
		String s2 = "Walter Winchell";
		String s3 = "stephen edwin king";
		
		boolean equals = s1.equalsIgnoreCase(s2);
		boolean equals1 = s1.equalsIgnoreCase(s3);
		
		System.out.println( s1 + "\" equals \"" +
	            s2 + "\"? " + equals);
	        System.out.println(s1 + "\" equals \"" +
	            s3 + "\"? " + equals1);
	}

}
