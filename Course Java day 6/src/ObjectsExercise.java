import java.util.Scanner;

public class ObjectsExercise {

	public static void main(String[] args) {
		// Obiektowo�� �wiczenia - show object 
		
		PeopleData newPerson = new PeopleData();
		
		newPerson.provideName("Adam");
		newPerson.provideAgeHeight(22, 182);
		newPerson.showPersonData();
		
		newPerson.provideNamesArr("Peter", "Slovaky");
		newPerson.showNamesFromArr();
		newPerson.returnFirstLetters();
		newPerson.femaleOrMale();
		
	}
	
	
}
