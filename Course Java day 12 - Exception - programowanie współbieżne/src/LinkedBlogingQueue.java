import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlogingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BlockingQueue<Integer> queue = new LinkedBlockingQueue(2);
		Random random = new Random();
		// Producent
		new Thread(() -> {
			
			for (;;) {
				try {
					Thread.sleep(random.nextInt(1000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					Integer insert = random.nextInt();
					queue.put(insert);
					queue.put(random.nextInt(1000));
					System.out.println("W³o¿y³em do kolejki " + insert);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		
		// Konsument
		new Thread(() -> {
			for(;;) {
				try {
					Thread.sleep(random.nextInt(1000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					queue.put(random.nextInt(1000));
					System.out.println("Pobieram z kolejki " + queue.take());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
	}

}
