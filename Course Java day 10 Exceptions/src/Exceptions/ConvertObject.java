package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ConvertObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> read = null;
		try {
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("out.data"));
			read = (List<String>) inputStream.readObject();
			inputStream.close(); 
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// zawsze sie wykonuje 
			} finally {
			 for (String reads : read) {
				 System.out.println(reads);
			 }
		    }
		if (read != null) {
			for (String reads : read) {
				 System.out.println(reads);
			 }
		}
		
	} 
}
