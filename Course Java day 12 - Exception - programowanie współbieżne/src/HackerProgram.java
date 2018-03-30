import java.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

class DownloadImage implements Runnable {

	private String name;
	private String url;

	public DownloadImage(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}
	
	
	public void run() {
		try(InputStream in = new URL(this.url).openStream()) {
			
			// tu mo¿na ustaliæ œcie¿ke
			Files.copy(in, Paths.get("images/ " + this.name));
			System.out.println("The picture is downloaded");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


public class HackerProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService service = Executors.newFixedThreadPool(3);
		IntStream.range(0, 101).forEach( i -> {
			service.submit(
					new DownloadImage("bitmap" + i + ".jpg", 
							"http://picsum.photos/200/200/?random")
					);
		});
		
	}

}
