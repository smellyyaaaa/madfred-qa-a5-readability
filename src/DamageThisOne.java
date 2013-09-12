import java.util.Scanner;

public class DamageThisOne {

	/**
	 * @author Clyde Brown
	 * @version 1.0
	 * @date August 12, 2013
	 * @param void
	 */
	
	public static void main(String[] args) {
		//This section declares variables and instantiates the Scanner sc
		int ticketNumber, stem, checkDigit;
		Scanner sc = new Scanner(System.in);
		
		/* This section requests input from the user, in the form of a 
		 * six digit number, then it generates a stem and checkdigit 
		 * from that number
		 */
		System.out.print("Please enter a six-digit ticket number: ");
		ticketNumber = sc.nextInt();
		stem = ticketNumber / 10;
		checkDigit = ticketNumber % 10;	

		/* This section will check the validity of the ticket number
		 * and continue to prompt the user for a new ticket number
		 * while the current number is invalid
		 */
		while (checkDigit != stem % 7) {
			System.out.println("That is NOT a valid ticket number, bucko!");
			System.out.print("Try again: ");
			ticketNumber = sc.nextInt();
			stem = ticketNumber / 10;
			checkDigit = ticketNumber % 10;	
		}
						
		System.out.println("That is a valid ticket number, well done!");
	
	}

}
