/*
 * Class: CMSC203 
 * Instructor:
 * Description: This program is a game and designed to have the user guess the number that has been selected between 0-100
 * Due: 2/25/2021
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Joseph Flores
*/

package abc;
import java.util.Scanner;

/**
 * 
 * @author Josep
 *
 *This Program is a game that will select a random number between 0 - 100 and have the user guess until they get the right number.
 *
 */

public class RandomNumberGuesser 
{

	/**
	 * This main function will display users screen and prompt 
	 * the user to guess several times until they guess the selected random number 
	 * @param 
	 *int randNum is used to store the random number that is decided by 'RNG.rand();'
	 *
	 *int nextGuess is used to take in the users next integer number and store it as their next guess
	 *
	 *int highGuess = 100 is use to start the user with a range to help them guess the correct number
	 *
	 *int lowGuess = 0 is use to start the user with a range to help them guess the correct number
	 *
	 *int numOfGuesses = 0 is declared as zero so with each guess it will be incremented by 1
	 *
	 *String runAgain will store the users 'yes' or 'no' answer
	 *
	 *boolean run = true is used to help end the program or rerun the program based on the choice of the user ;
	 * 
	 * boolean run2 = true is used to help end the second loop repeat until the parameters are met;
	 */ 

		public static void main(String[] args) //
		{

			int randNum;
			int nextGuess;
			int highGuess = 100;
			int lowGuess = 0;
			int numOfGuesses = 0;
			String runAgain;
			boolean run = false;
			boolean run2 = true;
			
				System.out.println("==================== Welcome to Guess That Number! ====================\n\n");
			
				do
				{
			
						System.out.println("A random number has be set");
				
						//calls method rand in RNG.java and assignees randNum a random number between 0 to 100
						randNum = RNG.rand();
				
						System.out.println(randNum);//this is to know what the random number is
				
				
	//actually starts			
						//asks user to guess what the random number is
						System.out.print("Enter your first guess: ");
						Scanner kb = new Scanner(System.in);
						nextGuess = kb.nextInt();
						kb.nextLine();
				
						RNG.inputValidation(nextGuess, lowGuess, highGuess);
				
						numOfGuesses = RNG.getCount();
						
						System.out.println("Guess attempt number " + numOfGuesses);
				
						
						
						
						
						
						//will at least once while the do while loop so it can declare the users guess
						do
						{
							//if the users guess is greater than the random number it will re-assign the new highest number and update the range
							if (nextGuess > randNum)
					
							{
								highGuess = nextGuess;
								System.out.println("Your guess is too high");
								RNG.inputValidation(nextGuess, lowGuess, highGuess);
								System.out.println("Please guess again: ");
								nextGuess = kb.nextInt();
								
								numOfGuesses = RNG.getCount();
								
								System.out.println("Guess attempt number " + numOfGuesses);
							
							}
				
							//if the users guess is less than the random number it will re-assign the new lowest number and update the range
							else if (nextGuess < randNum)
								{
									lowGuess = nextGuess;
									System.out.println("Your guess is too low");
									RNG.inputValidation(nextGuess, lowGuess, highGuess);
									System.out.println("Please guess again: ");
									nextGuess = kb.nextInt();
									
									numOfGuesses = RNG.getCount();
									
									System.out.println("Guess attempt number " + numOfGuesses);
								}
							
				//if the user guessed the right answer it will end the do while loop
							else if (nextGuess == randNum)
								{
								//System.out.println("Congratulation you guessed right!");
								run2 = false;
								}
						} while (run2 == true);

//asks user if they want to re run the program yes or no
				System.out.println("Congradulations, you guessed the right number!" );
				System.out.println("It was " + randNum + " it only took " + numOfGuesses + " tries");
				System.out.println("Do you want to run again yes or no");
				runAgain = kb.nextLine();
				kb.nextLine();
				
//if the user answers yes to run again the program will run				
				if (runAgain.equalsIgnoreCase("yes"))
				{
					run = false;
					//RNG.resetCount();
				}
			
//				
				else if (runAgain.equalsIgnoreCase("no"))
				{
					System.exit(0);
				}
				run2 = true;
			} while (run != true);
				
		}

	}
