package adv;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterfaceExample d = (a,b)->{
		//	System.out.println(a+b);
			return(a+b);
		//	System.out.println("I am functional interface implemented by Lambda expression.");
		};
		System.out.println(d.add(40,50));
		//d.add();
	}
}

@FunctionalInterface
public interface FunctionalInterfaceExample {
	//void add();
	int add(int a, int b);
}

