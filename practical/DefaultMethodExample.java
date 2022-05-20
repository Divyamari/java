package adv;

public class DefaultMethodExample implements Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethodExample d = new DefaultMethodExample();
		d.display("Good Morning"); //calling abstract method
		d.display1(); //calling default method
		Sample.my(); //calling static method
		}
	public void display(String a) {
		System.out.println(a);
	}
}

public interface Sample {
	void display (String a);//abstract method
	
	default void display1() { //default method
		System.out.println("Iam default method");
	}
	static void my() { //static method
		System.out.println("Iam static method");
	}
	
}

