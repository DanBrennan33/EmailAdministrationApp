package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	// Construct an email with the follow syntax: firstname.lastname@company.com
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		// Call a method asking for department - return department
		this.department = setDepartment();
		
		System.out.println("DEPARTMENT: " + this.department);
	}
	
	// Determine the department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
		Scanner input = new Scanner(System.in);
		int departmentNum = input.nextInt();
		switch (departmentNum) {
			case 1:
				return "sales";
			case 2:
				return "dev";
			case 3:
				return "acct";
			default:
				return "";
		}
	}
			
	// Generate random String for password
	
	
	/*
	 * Have set methods:
	 * Change the password
	 * set the mailbox capacity
	 * define an alternate email address
	 * 
	 */
	
	
	/*
	 * Have get methods to display:
	 * name
	 * email
	 * mailbox capacity
	 * 
	 */
	
}
