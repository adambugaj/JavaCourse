import java.util.Scanner;

public class PeopleData {
		
	// Właściwości
		private String firstName = "not defined";
		private String surName = "not defined";
		private String[] names = new String[2];
		private int age = 0;
		private String sex = "not provided";
		private int height = 0;
		
	// Metody
		
		// Constructor for object
		/*public PeopleData(int age, int height) {
			this.age = age;
		}*/
		
		// Provide name
		public void provideName(String firstName) {
			 this.firstName = firstName;
		}
		
		// Provide the names to Arrays
		public void provideNamesArr(String firstName, String secondName) {
			names[0] = firstName;
			names[1] = secondName;
		}
		
		public void showNamesFromArr() {
			System.out.format("Your names are %s", this.names[0] + " " + this.names[1]);
		}
		
		// Provide Age and Height
		public void provideAgeHeight(int age, int height) {
			this.age = age;
			this.height = height;
		}
		
		// Show personal data
		public void showPersonData() {
			System.out.format("Your name is %s\nYour age is %d\nYour height is %d\n", this.firstName, this.age, this.height);
		}
		
		public void femaleOrMale() {
			
			int userDataNumber = 0;
			int userDataString = 0;
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Type your age: ");
			userDataNumber = scanner.nextInt();
			System.out.format("Your number is %d", userDataNumber);
			this.age = userDataNumber;
			System.out.println("Your provided data is " + this.age);
			
			//userDataNumber = scanner.nextInt();
			//userDataString = scanner.next();
			
		}
		
		
		// Return first letter of the names
		public String returnFirstLetters() {
			
		/*	for(int i = 0; i > this.firstName.length; i++) {
				this.firstName.charAt(1);
			}*/
			System.out.println("First letter is: " + firstName.charAt(0));
			
			return "0";
		}
		
}
