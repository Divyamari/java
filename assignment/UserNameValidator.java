package adv;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserNameValidator {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName :");
		String s = sc.next();
		boolean b1 = Pattern.matches("^[A-Za-z][A-Za-z0-9_]{8,30}$",s);
		if (b1==true) {
		System.out.println("Valid");
		} else {
		System.out.println("Invalid");
		}
		}
	
	
	}

