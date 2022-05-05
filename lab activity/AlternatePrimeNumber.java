import java.util.Scanner;

public class AlternatePrimeNumber {

		static int checkPrime(int n)
		{
			int i;
			int flag = 0;
			for(i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					flag = 1;
					break;
				}
			}
			if(flag ==0)
				return 1;
			else
				return 0;
		}

	private static void printAlterantePrimeNumber(int num) {
		// TODO Auto-generated method stub
		int temp =2;
		for (int n = 2; n<=num-1;n++)
		{
			if(checkPrime(n)==1) {
				if(temp%2==0)
				System.out.println(n + " ");
				temp++;
			}
		}
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	int n;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a numbeer: ");
	n = s.nextInt();
	
	System.out.println("Alternate prime number up to "+" are" );
	printAlterantePrimeNumber(n);
	
}
}