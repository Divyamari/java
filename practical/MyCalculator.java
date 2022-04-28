package exception_handling;

public class MyCalculator {
	long power( int n, int p) throws Exception{
		if(n<0 || p<0) {
			throw new Exception ("n or p should not be negative");
		}
		else if (n==0 && p==0) {
			throw new Exception ("n and p should not be zero");
		}
		else
		return (long)Math.pow(n,p);
		
	}

	public static void main(String[] args, MyCalculator MyCalculator) throws Exception{
		// TODO Auto-generated method stub
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.power(3,5));
	}

}
