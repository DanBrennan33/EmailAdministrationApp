package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email user1 = new Email("John", "Doe");
		
		/*System.out.println("");
		// Calling Getter Methods - Before
		System.out.println(user1.getEmail());
		System.out.println(user1.getFullName());
		System.out.println(user1.getAlternateEmail());
		System.out.println(user1.getMailboxCapacity());
		System.out.println(user1.getPassword());
		
		// Calling Setter methods
		user1.changePassword("Password1");
		user1.setMailboxCapacity(1000);
		user1.setAlternateEmail("jdo@gmail.com");
		
		System.out.println("");
		
		// Calling Getter Methods - After
		System.out.println(user1.getEmail());
		System.out.println(user1.getFullName());
		System.out.println(user1.getAlternateEmail());
		System.out.println(user1.getMailboxCapacity());
		System.out.println(user1.getPassword());*/
		
		System.out.println(user1.showInfo());
		
	}

}
