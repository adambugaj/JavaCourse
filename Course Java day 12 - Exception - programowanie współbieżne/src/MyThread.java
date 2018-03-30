import java.util.concurrent.Semaphore;

class ObjectThread extends Thread {
	
	private String name;
	
	public ObjectThread(String var) {
		this.name = var;
	}
	public void run() {
		for(int i = 0; i < 1000; i++) {
			MyThread.syncSemaphore.acquireUninterruptibly();
			MyThread.value = MyThread.value - 1;
			MyThread.syncSemaphore.release();
			//System.out.println(name + " " + i);
		}
	}
}

class ObjectThread1 extends Thread {
	
	private String name;
	
	public ObjectThread1(String var) {
		this.name = var;
	}
	public void run() {
		for(int i = 0; i < 1000; i++) {
			MyThread.syncSemaphore.acquireUninterruptibly();
			MyThread.value = MyThread.value + 1;
			MyThread.syncSemaphore.release();
			//System.out.println(name + " " + i);
		}
	}
}

public class MyThread {
	static Semaphore syncSemaphore = new Semaphore(1);
	static int value = 0;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread myThread1 = new ObjectThread("My thread 1");
		Thread myThread2 = new ObjectThread1("My thread 2");
		myThread1.start();
		myThread2.start();
		myThread1.join();
		myThread2.join();
		System.out.println("Value: " + value);
		
	}
}
