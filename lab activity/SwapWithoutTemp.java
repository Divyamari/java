
public class SwapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Divya";
		String b = "Abi";
		System.out.println("Before swap: " +a+ " " +b );
		a= a+b;
		b = a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		System.out.println("After swap: " +a+ " " +b );
	}

}
