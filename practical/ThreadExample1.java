package threads;

public class ThreadExample1 implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Iam thread... Thread is running usind Runnable");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample1 t = new ThreadExample1();
		Thread th = new Thread(t);
		th.start();
	}

	
}
