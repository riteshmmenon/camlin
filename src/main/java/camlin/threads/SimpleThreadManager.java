package camlin.threads;

public class SimpleThreadManager {

	
	public static void main(String[] args) {
		Thread thread = new Thread(new MyThread(1));
		thread.start();
		Thread thread2 = new Thread(new MyThread(2));
		thread2.start();

	}

}
