package adv;

public class MethodReferenceExample {
	
	public void display(String a) {
	System.out.println("Hello ... Iam " +a);
	}
	
	public static void main(String[] args) {
		MethodReferenceExample m = new MethodReferenceExample();
		
		Sample s = m::display;
		s.display(("Divya");
	}
	

}
