package first;
import java.util.Scanner;


//*******************************************************************
//* Developer Name: Halim Dogrusoz
//* Date created: 9/15/2020
//* Class Name: Assignment1
//* Description: This program is a wifi diagnostic tool. It asks successive 
//*              Questions to help the user troublechoot its wifi problems
//*******************************************************************


public class Assignement1 {
	public static void main(String[] args) {
		// String Constants
		final String YES = "yes";
		final String NO = "no";
		
		 
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
		System.out.println("First step: reboot your computer");
		
		// Asks first Question to user then get the response
		System.out.println("Are you able to connect with the internet? (yes or no)");
		Scanner myObj= new Scanner(System.in);
		String answer = myObj.nextLine();
		
		// Depending on the users input either continue with the second question or terminate the program
		switch(answer)
		{
			case YES:
				System.out.println("Thank you for using our services. Happy Surfing!!");
				break;
			case NO:
				System.out.println("Reeboot the router and try to connect");
				System.out.println("Are you able to connect to the internet? (yes or no)");
				String answer1 = myObj.nextLine();
				
		// Depending on the users input either continue with the third question or terminate the program
				switch(answer1)
				{
				case YES:
					System.out.println("Thank you for using our services. Happy Surfing!!");
					break;
				case NO:
					System.out.println("Make sure the cables connecting the router are firmly plugged in and power is getting to the router");
					System.out.println("Are you able to connect to the internet? (yes or no)");
					String answer2 = myObj.nextLine();
		
		// Depending on the users input either continue with the third question or terminate the program
					switch(answer2)
					{
						case YES:
							System.out.println("Thank you for using our services. Happy Surfing!!");
							break;
						case NO:
							System.out.println("Move the computer closer to the router and try to connect");
							System.out.println("Are you able to connect to the internet? (yes or no)");
							String answer3 = myObj.nextLine();
		
		// Terminate the Program regardless of response
							switch(answer3)
							{
								case YES:
									System.out.println("Thank you for using our services. Happy Surfing!!");
									break;
								case NO:
									System.out.println("Contact your ISP");
									break;
							}
						
					}			
				}
		}
		System.out.println("This program was made by Halim Dogrusoz");
	}
}
