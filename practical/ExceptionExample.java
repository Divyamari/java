
public class ExceptionExample {
	
	public void show() {
		String a = "iam error";
		System.out.println(a);
		
		try {
		int i = 50/1;//arithmeticException
		System.out.println(i);
		
		String s = "divya";//nullpointerException
		System.out.println(s.length());
		
		int arr[] = new int[3];
		arr[4] = 23;//arrayindexoutofBoundEception
		
		int m = Integer.parseInt(s);//NumberFormatException
		System.out.println(m);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		String b = " i cannot be handle";
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionExample ee = new ExceptionExample();
		ee.show();
	}

}
