import java.util.Scanner;

public class DamageThisOne 



{

	/**
	 * @author smellyyaaaa
	 * @version 10000000000000.99999
	 * @date nov.16 1900
	 * @param nope
	 */
	
	public static void main(String[] args) {
		//This is the song that never ends and i dont know the rest of the song but im just gonna keep typing random words till i dont feel like typing anymore oh and this kinda doesnt make any sense whats so ever but i just wanted to make a really random comment goodbye
int ticketnumber, stem, check_Digit;
																								Scanner sc = new Scanner(System.in);
		
		/* This section requests input from the user, in the form of a 
		 * a bunch of numbers  
		 * than i have no clue what it does 
		 */
		System.out.print("Please enter a six-digit ticket number: ");
ticketnumber = sc.nextInt();
					stem = ticketnumber / 10;
		check_Digit = ticketnumber % 10;	

		/* 
		 */
		while (check_Digit != stem % 7) {
	System.out.println("That is NOT a valid ticket number, bucko!");
			System.out.print("Try again: ");
			           ticketnumber = sc.nextInt();
			
			           
			           
			           stem = ticketnumber / 10;
check_Digit = ticketnumber % 10;	
}
						
		System.out.println("That is a valid ticket number, well done!");
	
												}



																																						
																												}
