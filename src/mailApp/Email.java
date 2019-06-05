package mailApp;

import java.util.Scanner;

public class Email {

	private String firstName, lastName, password, department, alternateEmail, email;
	private int mailboxCapacity;
	private int defaultPasswordlength = 5;
	private int mailBoxCapacity = 500;
	private String companySuffix = "bashyalcompany.com";

	// Constructor to receive first Name and Last Name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL GENERATED:  " + this.firstName + " " + this.lastName);

		// Call a method asking for the department and return that info to the user
		this.department = setDepartment();
		System.out.println("Department: " + this.department);

		// Call a method that return password
		this.password = randomPassword(defaultPasswordlength);
		System.out.println("Your password is: " + this.password);

		// Combine all elements to create an email
		email = firstName.toLowerCase() + " ," + lastName.toLowerCase() + "@" + department + companySuffix;
		System.out.println("Your Email is " + email);

	}

	// Ask for the department
	private String setDepartment() {
		System.out.println("1 for Computing, 2 for Business");
		Scanner sc = new Scanner(System.in);
		int depChoice = sc.nextInt();
		if (depChoice == 1) {
			return "Computing";
		} else if (depChoice == 2) {
			return "Business";
		} else
			return null;
	}

	// Generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!£$%^&*()1234567890";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	// Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;

	}
	// Set the alternate Email

	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}

}
