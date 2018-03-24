package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class ExceptWithCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mojaLista = new LinkedList<>();
		mojaLista.add("budynek");
		mojaLista.add("wie¿owiec");
		
		try {
			ObjectOutputStream objectStream = new ObjectOutputStream(new FileOutputStream("out.data"));
			objectStream.writeObject(mojaLista);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
