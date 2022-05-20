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
