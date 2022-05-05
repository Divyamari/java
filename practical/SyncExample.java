package threads;

public class SyncExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sync method
		Sample s = new Sample();
		Thread1 t = new Thread1(s);
		Thread2 t1 = new Thread2(s);
		
		t.start();
		t1.start();
		
		//sync static method
		/*Thread1 t = new Thread1(s);
		Thread2 t1 = new Thread2(s);
		
		t.start();
		t1.start();*/
	}
}
public class SyncSample {
	
}
	//synchronized  void print (int num) { //sync method
	synchronized static void print (int num) { //sync static method
		for (int i=1; i<=5; i++) {
			System.out.println(num*i);
			try {
				Thread.sleep(500);
				}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
class Thread1 extends Thread{
	
	public void run() {
		SyncSample.print(3);
	}
}
class Thread2 extends Thread{
	
	public void run() {
		SyncSample.print(5);
	}
}
