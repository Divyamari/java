package threads;

public class DaemonExample extends Thread {
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("Iam Daemon");
		}
		else {
			System.out.println("Iam User");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonExample t = new DaemonExample();
		DaemonExample t1 = new DaemonExample();
		DaemonExample t2 = new DaemonExample();

			t2.setDaemon(true);
			t.start();
			t1.start();
			t2.start();
	}

	
	}

