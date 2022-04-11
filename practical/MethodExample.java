import java.util.Scanner;
class MethodExample{
public void evenodd(int num){
if (num%2==0){
	System.out.println("it is even " +num);
	}
else
	System.out.println("it is odd " +num);
	}
public static int add(int n1, int n2){
	int result = n1 + n2;
	return result;
}
public static void main(String args[]){
int n1 = 50;
int n2 = 100;
int result = add(n1,n2);
System.out.println("addition is" +result);	
	
Scanner sc = new Scanner(System.in);
System.out.println("enter the value");
int num = sc.nextInt();

MethodExample m = new MethodExample();
m.evenodd(num);
}
}
 