
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
		/*int a=10;
		int b=20;
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		}
		}*/
