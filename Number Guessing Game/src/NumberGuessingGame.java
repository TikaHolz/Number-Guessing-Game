import java.util.Scanner;
public class NumberGuessingGame
	{

		public static void main(String[] args)
			{
				boolean stillGuessing = true;
			do
				{
		
				int counter = 0;
				int difficulty = 0;
			
				//number
				int secretNumber = (int) (Math.random()* 6)  + 1;
			
				Scanner userStringInput = new Scanner(System.in);
				System.out.println("What is your name?");
				String name = userStringInput.nextLine();
			
				
				counter ++;
				Scanner userIntInput = new Scanner(System.in);
				System.out.println("Guess a number between 1-5");
				int guess = userIntInput.nextInt();
			
				if(guess > secretNumber)
					{
					System.out.println("Sorry, too high");
					stillGuessing = true;
					}
				else if(guess < secretNumber)
					{
					System.out.println("Sorry too low");
					stillGuessing = true;
					}
				else if (guess == secretNumber)
					{
					System.out.println("Good Job " + name +"!");	
					stillGuessing = false;
					if(counter >1)
						{
						System.out.println("It took you " + counter + " tries to guess the number");
						}
					else
						{
						System.out.println("It took you 1 try to guess the number");	
						}
					}
				}
			while(stillGuessing);

	}
	}
