package infiniteterrain;

import java.util.Random;
import java.util.Scanner;

public class Take2 {

	public static void main(String [] args) {
		

		// system objects
		
		Scanner in= new Scanner(System.in);
		Random rand = new Random();
		
		/* game variables
		
	 	int magicCompass;
		String treasure; */
		
		// player variable ]
		
		String north= "1";
		String East = "2";
		String South= "3";
		String West = "4";
		
		
		boolean running = true;
		
		GAME:
		
		System.out.println(" Welcome to Estoria \n");
		while (running ) {
			
			System.out.println(" You are stranded in the middlde of Estoria;"
					+ " \n an intergalitc wasteland. Using the magic compass,"
					+ " \n you must locate the teleporter in order to return back to present day \n ");
			
			System.out.println("\t>  You arrive at a crossroad, you have no idea where you currently are ");
			System.out.println("\t> You can only travel North, East, Sout or west in order to find the teleporter");
			System.out.println("\n\t  Where would you like to go first ? ");
			
			
			System.out.println("\t1. North ");
			System.out.println("\t2. East ");
			System.out.println("\t3. South ");
			System.out.println("\t4. West ");
			
			String input= in.nextLine();
				if (input.equals("1")) 
				{
					System.out.println(" \t> You went north, the magic compass flashes reading '10m away'");
					System.out.println("\t1. North ");
					System.out.println("\t2. East ");
					System.out.println("\t3. South ");
					System.out.println("\t4. West ");
					
					
					if (input.equals("1")) {
						System.out.println("You've found the teleporter, Quick jump in");
						System.out.println("The end");
					}
					
					else if (input.equals("2")) {
						System.out.println("You've gone east, 30m away");
					}
					
					else if (input.equals("3")) {
						System.out.println("You've gone south, '10m away' ");
					}
					
					else if (input.equals(4))
					{
						System.out.println("youve gone west, '30 maway'");
					}
				}
				
				else if (input.equals("2")) {
				
					System.out.println("you went east, '20m away");
	
					System.out.println("\t1. North ");
					System.out.println("\t2. East ");
					System.out.println("\t3. South ");
					System.out.println("\t4. West ");
					
					if (input.equals("1")) {
						
						System.out.println("");
						
					}
					 
				}
				
				else if (input.equals("2")) 
				{
					System.out.println(" \t>  You went East, the magic compass flashes reading '10m' " );
					System.out.println("\t1. North ");
					System.out.println("\t2. East ");
					System.out.println("\t3. South ");
					System.out.println("\t4. West ");
				}
				
				else if (input.equals("3")) 
				{
					System.out.println(" \t>  You went west, the magic compass flashes reading 20m ");

					System.out.println("\t1. North ");
					System.out.println("\t2. East ");
					System.out.println("\t3. South ");
					System.out.println("\t4. West ");
					
					if (input.equals("1")) {
						
						System.out.println("you went north, 30m away");
			
					}
					
					else if (input.equals("2")) {
						System.out.println("you went East, 10m away");
						
					}
					
				}
				
				else if (input.equals("4"))
				{
					System.out.println("\\t> you went South, and found the magic compass !!!");
					
					System.out.println("\t> Thanksfor playing, The end. ");

				}
	
				
				else 
				{
					System.out.println("Invalid response!!!!! try again using the numbers e.g 1,2,3,4");
				}
				
				


				 break;
			
		
		}
		
		
		
		
		
		
		
		
		}
}
