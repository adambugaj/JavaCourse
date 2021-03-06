package PasswordGenerator;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Password {

	private String randomPassword;
	private int savedPassword = 0;
	private String userName;
	private String department;
	private String loginSuccess;
	private int counterOfUser = 0;
	
	
	public Password() {
		this.userName = setUsername();
		this.department = setDepartment();
		this.randomPassword = generatePassword();
		this.loginSuccess = checkUsername();
		this.counterOfUser = countUsers();
	}
	
	Scanner scanner = new Scanner(System.in);
	
	private String setDepartment() {	
		System.out.println("1. IT, 2. PR, 3. WEB 4.HR\nChoose department 1, 2, 3, 4"); 
		int departNumber = scanner.nextInt();
		
		if (departNumber == 1) return "IT";
		if (departNumber == 2) return "PR";
		if (departNumber == 3) return "WEB";
		if (departNumber == 4) return "HR";
		return "";
	}
	
	private String setUsername() {
		System.out.print("Provide username: ");
		userName = scanner.next();
		
		
		return userName;
	}
	
	public void showData() {
		System.out.println("Your data is: " + this.userName + " " + this.department + "\nYour password is: " + this.randomPassword);  
	}
	public void showPassword() {
		System.out.format("Your password is%\n", this.randomPassword);
	}
	
	private String generatePassword() {
		Random random = new Random();
		
		System.out.print("Generate password or type your own - choose y or n: ");
		String generateOrNot = scanner.next();
		System.out.println(generateOrNot);
		if (generateOrNot.equals("y")) {
			System.out.println("Genereting random password...");
			String[] forPassword = {"0","1","2","3","a","b","c","d","e","f", "#", "$", "%"};
			
			String randomPassword = "";
			for(int i = 0; i < forPassword.length; i++) {
				randomPassword += forPassword[random.nextInt(10)];
			}
			System.out.println("Done");
			return randomPassword;
		} else {
			System.out.println("Type your password: ");
			String yourPassword = scanner.next();
			return yourPassword;
		} 
	}

	public void setSavedPassword() {
		
	}
	
	public String checkUsername() {
		System.out.println("Would you like to login? y or n");
		String loginAccept = scanner.next();
		if (loginAccept.equals("y")) {
			// Jak sciagnac zmienn� z listy?
			System.out.println("Login accepted");
			return "y";
		} else {
			System.out.println("Login is not accepted");
			return "n";
		}
	}

	public int getSavedPassword() {
		return savedPassword;
	}
	
	public String getUsername() {
		return userName;
	}
	
	// Do a calculations down here
	private int countUsers() {
		return 0;
	}
	
	
}
