package threads;

public class SequentialExample {

	public static void main(String[] args) {
		for(int i =1; i<=5; i++) {
			try {
				Thread.sleep(800);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
}
