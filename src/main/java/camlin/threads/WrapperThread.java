package camlin.threads;

public class WrapperThread implements Runnable {
	
	private boolean available = true;
	private Runnable runnable;
	Thread t = null;
	private boolean alive = true;
	private int count = 0;
	
	public WrapperThread() {
		t = new Thread(this);		
		t.start();		
	}
	
	public WrapperThread(Runnable runnable) {
		this.runnable = runnable;
		available = false;
	}
	
	@Override
	public void run() {	
		synchronized(this) {
			while(alive) {
				try {					
					this.wait();
					//System.out.println(Thread.currentThread()+" running.........."+count);
					if(runnable != null) {
						runnable.run();
						runnable = null;
					}
					available = true;
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread()+" terminates...........");
		} // end of synchronized
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Runnable getRunnable() {
		return runnable;
	}

	public void setRunnable(Runnable runnable) {
		this.runnable = runnable;
		this.available = false;
		++count;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
		
}
