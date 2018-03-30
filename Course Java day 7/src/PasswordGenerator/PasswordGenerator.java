package PasswordGenerator;

import java.util.*;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listUsers();
		showPasswords();
		checkUsername();
	}
	
	public static List<Password> userList = new LinkedList<>();
	public static void listUsers() {
		Password user1 = new Password();
		//Password user2 = new Password();
	
		userList.add(user1);
		//userList.add(user2);
		
		
		//user1.showData();
		//user1.checkUsername(userLidst);
		//user2.showData();
		//inheritence need to do a second method of this loop
		
	}
	
	private static void checkUsername() {
		
		String username;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type your username: ");
		
		username = scanner.next();
		System.out.println(username);
		
		for (int i = 0; i < userList.size(); i++) {
			System.out.format("Your username is %S", userList.get(i).getUsername());
			if (userList.get(i).equals(username)) {
				// Jak sciagnac zmienn¹ z listy?
				System.out.println("Login accepted" + userList.get(i));
			} else {
				System.out.println("Login is not accepted. Please try again");
			}
		}
	}
	
	private static void showPasswords() {
		for (int i = 0; i < userList.size(); i++) {
			System.out.format("Your password is %s", userList.get(i).getSavedPassword());
		}
	}
}
