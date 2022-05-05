package threads;

public class Data {
	
	int i;
	 boolean valueset = false;
	 
	 synchronized void produce(int i ) {
		 if(valueset)
			 try {
				 wait();
			 }
		 catch(Exception e ) {
			 System.out.println(e);
		 }
		 this.i = i;
		 valueset = true;
		 System.out.println("Data production done "+i);
		 notify();
	 }
		 synchronized int consume() {
			 if(!valueset)
				 try {
					 wait();
				 }
			 catch(Exception e) {
				 System.out.println(e);
			}
			 valueset = false;
			 System.out.println("Data consumed "+i);
			 notify();
			 return i;
		 }
}


	class producer extends Thread {
		Data d;
		public producer(Data d) {
			this.d = d;
		}
		public void run() {
			for (int j =1; j<=5; j++) {
				d.produce(j);
			}
		}
	}
	class consumer extends Thread{
		Data d;
		public consumer(Data d) {
			this.d= d;
		}
		public void run() {
			for(int k=1; k<=5; k++) {
				d.consume();
			}
		}
	}
public class ThreadCommExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		producer p = new producer(d);
		consumer c = new consumer(d);
		p.start();
		c.start();
	}

}
