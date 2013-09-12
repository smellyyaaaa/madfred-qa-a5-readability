import java.util.Scanner;

public class FixThisOne {

	public static void main(String[] args) 
	{
		//This program checks your airline tickets
		 //This is a bynch of code dunno what it doez
		final float PRICE_PER_DOZEN = 3.25f;final float PRICE_PER_SINGLE = 0.45f;
		int eggs, d, s;
			float dozens_cost, singlesCost, tc;
		Scanner kbrd = new Scanner(System.in);
		System.out.print("How many eggs do you want? >> ");
		eggs = kbrd.nextInt();
		d = eggs / 12;
		s = eggs % 12;
		dozens_cost = d * PRICE_PER_DOZEN;
		singlesCost = s * PRICE_PER_SINGLE;
		tc = dozens_cost + singlesCost;
		
		/*This program checks your airline tickets
		 * This is a block comment
		 * Coding is fun!
		 */
		System.out.println("You ordered " + eggs + " eggs in total.");
			System.out.println("That's " + d + " dozen at $3.25, or $" + dozens_cost);
				System.out.println("That's " + s + " singles at 45c, or $" + singlesCost);
				System.out.println("Your total cost is $" + tc);
		
	
	}

}
