import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExercise {

	private static int bufor = -1;
	Random prodRandom = new Random();
	ReentrantLock lock = new ReentrantLock();
	Condition producentCondition;
	Condition konsumentCondtion;
	
	{
		producentCondition = lock.newCondition();
		konsumentCondtion = lock.newCondition();
	}
	
	
	
	 void producent() {
		while(bufor >= 0) {
			System.out.println("Producent musi poczekaæ");
			try {
				wait();
				System.out.println("Producent jest obudzony.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		bufor = prodRandom.nextInt(10000);
		System.out.println("Wstawi³em do bufora " + bufor);
		konsumentCondtion.signal();
		lock.unlock();
	}
	

	synchronized void konsument() {
		while(bufor < 0) {
			System.out.println("Bufor by³ pusty.");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Pobra³em liczbê " + bufor);
		bufor = -1;
		producentCondition.signalAll();
		lock.unlock();
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer buf = new Customer();
		new Thread( () -> {
			
			Random random = new Random();
			
			for (;;) {
				try {
					Thread.sleep(random.nextInt(1000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				buf.producent();
/*				if(bufor < 0) {
					bufor = random.nextInt(10000);
					System.out.println("Wstawi³em liczbê " + bufor);
				} else {
					System.out.println("Bufor jest pe³ny");
				}*/
			}
		}).start();
		
		// Producent 2
		new Thread( () -> {
			
			Random random = new Random();
			
			for (;;) {
				try {
					Thread.sleep(random.nextInt(1000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				buf.producent();
/*				if(bufor < 0) {
					bufor = random.nextInt(10000);
					System.out.println("Wstawi³em liczbê " + bufor);
				} else {
					System.out.println("Bufor jest pe³ny");
				}*/
			}
		}).start();
		
		
		// Konsumer
		new Thread(() -> {
			Random random = new Random();
			for(;;) {
				try {
					Thread.sleep(random.nextInt(1000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				buf.konsument();
/*				if(bufor >= 0) {
					System.out.println("Pobra³em liczbe " + bufor);
					bufor = -1;
				} else {
					System.out.println("Bufor jest pusty");
				}*/
			}
			
		}).start();
	}
}
