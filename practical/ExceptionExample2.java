package exception_handling;

import java.util.Scanner;

public class ExceptionExample2 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner s = new Scanner("System.in")) {
			System.out.println("Enter two numbers:");

				try {
					int x = s.nextInt();
					int y = s.nextInt();
					System.out.println(x/y);
				}
				catch(Exception e) {
					System.out.println(e);
				}
		}
		}
	}


