package threads;

public class ThreadExample extends Thread{
	
	public void run() {
		System.out.println("Iam thread... Thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample t = new ThreadExample();
		t.start();
	}

}
