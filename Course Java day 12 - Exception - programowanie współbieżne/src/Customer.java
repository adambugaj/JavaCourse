import java.util.Random;

public class Customer {

	private static int bufor = -1;
	Random prodRandom = new Random();
	
	synchronized void producent() {
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
		notify();
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
		notify();
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
