package threads;

public class NonSyncExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample();
		Thread1 t = new Thread1(s);
		Thread2 t1 = new Thread2(s);
		
		t.start();
		t1.start();
	}

}
