package ExceptionsWithTry;

import java.io.Closeable;
import java.io.IOException;

public class ExceptionsTry implements Closeable{
	
		public void close() throws IOException {
			//throw new IOexception("My close exception");
		}
}
