package camlin.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JavaThreadPool {

	
	public static void main(String[] args) {
		//ExecutorService service = Executors.newCachedThreadPool();
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		MyThread thread = new MyThread(1);
		service.execute(thread); //1
		thread = new MyThread(2);
		service.execute(thread); //2
		thread = new MyThread(3);
		service.execute(thread); //3
		thread = new MyThread(4);
		service.execute(thread); //4
		thread = new MyThread(5);
		service.execute(thread); //5
		thread = new MyThread(6);
		service.execute(thread); //6
		thread = new MyThread(7);
		service.execute(thread); //7
		thread = new MyThread(8);
		service.execute(thread); //8
		thread = new MyThread(9);
		service.execute(thread); //9
		thread = new MyThread(10);
		service.execute(thread); //10
		thread = new MyThread(11);
		service.execute(thread); //11
		thread = new MyThread(12);
		service.execute(thread); //12
		service.shutdown();
		while(!service.isTerminated()) {
			//System.out.println("Hello!");
		}
	}

}
