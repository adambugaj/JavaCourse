import java.util.concurrent.Semaphore;

class ShowNumber implements Runnable {
	private String displayString;
	private Semaphore s1;
	private Semaphore s2;
	
	
	public ShowNumber(String displayString, Semaphore s1, Semaphore s2) {
		super();
		this.displayString = displayString;
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public void run() {
		for(;;) {
			this.s1.acquireUninterruptibly();
			//PrintMethod.syncSemaphore.acquireUninterruptibly();
			System.out.println(this.displayString);
			this.s2.release();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

public class PrintMethod {
	
	
	static Semaphore syncSemaphore = new Semaphore(1);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Semaphore s1 = new Semaphore(1);
		Semaphore s2 = new Semaphore(0);
		Semaphore s3 = new Semaphore(0);
		
		
		new Thread(new ShowNumber("1", s1, s2)).start();
		new Thread(new ShowNumber("2",s2, s3)).start();
		new Thread(new ShowNumber("3", s3, s2)).start();
	}

}
