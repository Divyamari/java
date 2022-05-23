package adv;

public interface Sample {
	void display (String a);//abstract method
	
	default void display1() { //default method
		System.out.println("Iam default method");
	}
	static void my() { //static method
		System.out.println("Iam static method");
	}
	
}
