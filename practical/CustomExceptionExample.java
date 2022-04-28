package exception_handling;

import java.util.Scanner;

import javax.management.InvalidApplicationException;

public class CustomExceptionExample {
	
	public void checkAge (int age) throws InvalidApplicationException{
		if (age <= 18 || age>= 25) {
			throw new InvalidApplicationException("invalid age for enrolling in the java course");
			}
		else
			System.out.println("proper age for enrolling in java course");
	}

	public static void main(String[] args) throws InvalidApplicationException {
		// TODO Auto-generated method stub
		CustomExceptionExample c = new CustomExceptionExample();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = s.nextInt();
		c.checkAge(age);
	}

}
