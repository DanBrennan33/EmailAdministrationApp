package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String company = "acmecorp.com";
	
	// Construct an email with the follow syntax: firstname.lastname@company.com
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		// Call a method to set department - return department
		this.department = setDepartment();
		
		// Call a method to set random password - return Randomly generated password
		this.password = setRandomPassword(defaultPasswordLength);
		
		// Combine elements generating email - fn.ln@dpt.company.com
		email = this.firstName + "." + this.lastName + "@" + this.department + "." + this.company;
		email = email.toLowerCase();
		
		System.out.println("EMAIL: " + this.email);
	}
	
	// Determine the department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
		Scanner input = new Scanner(System.in);
		int departmentNum = input.nextInt();
		String dpt;
		switch (departmentNum) {
			case 1:
				dpt = "sales";
				break;
			case 2:
				dpt = "dev";
				break;
			case 3:
				dpt = "acct";
				break;
			default:
				dpt = "";
				break;
		}
		return dpt;
	}
			
	// Generate random String for password
	private String setRandomPassword(int length) {
		String passwordAlphaNum = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i =0; i < length; i++) {
			int rand = (int)(Math.random() * passwordAlphaNum.length());
			password[i] = passwordAlphaNum.charAt(rand);
		}
			
		return new String(password);
	}
	
	/*
	 * Have set methods:
	 * Change the password
	 * set the mailbox capacity
	 * define an alternate email address
	 * 
	 */
	public void changePassword(String password) {
		this.password = password;
	}
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	/*
	 * Have get methods to display:
	 * name
	 * email
	 * mailbox capacity
	 * password
	 * 
	 */
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	public String getPassword() {
		return password;
	}
	
}
