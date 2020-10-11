package Assignment2;
import Assignment2.RNG;
import java.util.Scanner;

/**
* Developer Name: Halim Dogrusoz
* Date created: 9/25/2020
* Class Name: RandomNumberGuesser
* Description: This program is a game where the user guesses a
*            	 random number provided by the computer
*/

public class RandomNumberGuesser {
	public static void main(String[] args)
	{
		System.out.println("Random Number Guesser game");
		System.out.println("Developed by: Halim Dogrusoz");
		System.out.println("For CMSC 203." + '\n');
		
		

		// Constants
		//final String YES = "yes";
		final String NO = "no";
		
		String answer;
		
		// define scanner object myObj
		Scanner myObj= new Scanner(System.in);
		
		// define boolean variable gameisComplete and set it to false.
		boolean gameisComplete = false;
		
		// Run game until gameisComplete is true.
		while(gameisComplete == false)
		{
			// Initialize every integer variable
			int lowGuess = 0;
			int highGuess = 100;
			int numOfGuess = 0;
			int nextGuess = 0;
			boolean validGuess  = false;
			
			// Get the random Number from the RNG class
			
			int num = RNG.rand();
			
			//Used for debugging: System.out.println(num);
			
			
			// Get the first guess from the user while also making sure the user enters a value between lowGuess and highGuess
			while(!validGuess) {
				System.out.println("Enter your first guess (Between" + " " + lowGuess + " and " + highGuess + ")");
				nextGuess = myObj.nextInt();
				validGuess = RNG.inputValidation(nextGuess, lowGuess, highGuess);
			}
			
			// Increment the number of guesses
			numOfGuess++;
			
			// Prints out number of Guesses done
			System.out.println("Number of Guesses " + numOfGuess);
			
			// Until the user guesses the right number continue the loop
			while(nextGuess != num)
			{
				// Reinitialize validGuess value.
				validGuess = false;
				//Used for debugging: System.out.println(nextGuess);
				
				// if the users guess is greater than the random number print the message below and
				// make highGuess = nextGuess
				if(nextGuess > num)
				{
					System.out.println("Your Guess is too high");
					highGuess = nextGuess;
				}
				
				// if the users guess is lesser than the random number print the message below and
				// make lowGuess = nextGuess
				if(nextGuess < num)
				{
					System.out.println("Your Guess is too low");
					lowGuess = nextGuess;
				}
				
				// Get the users next guess
				while(!validGuess) {
					System.out.println("Enter your next guess (Between" + " " + lowGuess + " and " + highGuess + ")");
					nextGuess = myObj.nextInt();
					validGuess = RNG.inputValidation(nextGuess, lowGuess, highGuess);
				}
				
				// Increment the number of guesses
				numOfGuess++;	
				
				// Prints out number of Guesses done
				System.out.println("Number of Guesses " + numOfGuess);
			}
			
			// After the game is finished congratulate the player and ask if he/she wants to play again
			System.out.println("Congratulations, you guessed correctly");
			System.out.println("Would you like to try again? (yes or no)");
			myObj.nextLine();
			answer = myObj.nextLine();
			
			
			if(answer.equals(NO))
			{
				gameisComplete = true;
			}
			
		}
		System.out.println("Thank you for playing my game");
		System.out.println("This program was made by Halim Dogrusoz");
		
		// CLose scanner object myObj
		myObj.close();
	}
}
