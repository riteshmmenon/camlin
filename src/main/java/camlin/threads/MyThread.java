package camlin.threads;

public class MyThread implements Runnable {
	
	private int id = 0;
	
	public MyThread() {}
	
	public MyThread(int id) {
		this.id = id;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread()+" running.................."+id);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread done!");
	}

	
}
