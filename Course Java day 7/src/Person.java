import java.util.Arrays;
import java.util.LinkedList;
import java.util.*;

public class Person {
	
	String firstName;
	String surName;
	int age = 0;
	
	public Person(String firstName, String surName, int age) {
		this.firstName = firstName;
		this.surName = surName;
		this.age = age;
	}
	
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public void lists() {
		List<Person> peopleList = new LinkedList<>();
		
		
		System.out.println(this.firstName);
		//peopleList.add();
		
		//List<String> name2 = new LinkedList<>(Arrays.asList("Pet","John"));
		
	}
	
	
}
