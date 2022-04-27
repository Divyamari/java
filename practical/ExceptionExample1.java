
public class ExceptionExample1 {

	
	static void mfunc() {
		try {
			//int i = 50/0;
			int i = 50/8;
			System.out.println(i);
			
			int arr[] = new int[3];
			arr[4] = 24;
	}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("iam finally block");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mfunc();
	}
}
