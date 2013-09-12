import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) 
	{
		//This program calculate the cost of the eggs
		/*This is block of code declares variables
		 * two floats price per dozen and price per single
		 */
		final float pricePerDozen = 3.25f;
		final float pricePerSingle = 0.45f;
		int eggs, d, s;
		float dozensCost, singlesCost, totalCost;
		
		//this uses the scanner key and prompts the user to enter how many eggs they want 
		Scanner kbrd = new Scanner(System.in);
		System.out.print("How many eggs do you want? >> ");
		eggs = kbrd.nextInt();
		
		/*this takes the number of eggs the user has entered
		 * and devides it by 12 and 1 to calculate the total cost 
		 */
		d = eggs / 12;
		s = eggs % 12;
		dozensCost = d * pricePerDozen;
		singlesCost = s * pricePerSingle;
		totalCost = dozensCost + singlesCost;
		
		/*this take the information and outputs it for the user
		 * by showing them how many eggs by dozen and single 
		 * than calculates the total for the user
		 */
		System.out.println("You ordered " + eggs + " eggs in total.");
			System.out.println("That's " + d + " dozen at $3.25, or $" + dozensCost);
				System.out.println("That's " + s + " singles at 45c, or $" + singlesCost);
				System.out.println("Your total cost is $" + totalCost);
		
	
	}

}
