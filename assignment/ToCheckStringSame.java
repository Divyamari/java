package adv;

public class ToCheckStringSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Stephen Edwin King";
		String s2 = "Walter Winchell";
		String s3 = "Mike Royko";
		
		boolean equals = s1.equals(s2);	
		boolean equals1 = s1.equals(s3);
		
		System.out.println(s1 + "\" equals \"" +s2 +"\"?" +equals);
		System.out.println(s1 + "\" equals \"" +s3 +"\"?" +equals1);
	}
}
