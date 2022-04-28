package exception_handling;

public class ExceptionExample3 {
	
	public static void myDisplay(int a) {
		if(a>=0 && a<35) {
			throw new ArithmeticException("value cannot be less than 30");
		}
		else 
			System.out.println("Your are pass");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myDisplay(75);
	}

}
