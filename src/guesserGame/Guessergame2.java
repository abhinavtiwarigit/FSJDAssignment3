package guesserGame;

import java.util.Scanner;

class player1
{
	int num1,guess1,num2,num3,tries=5;
	public void guesserguessnum()
	{
		System.out.println("LET'S PLAY AN EXCITING GUESSING GAME!!");
		System.out.println("***************************************");
		System.out.println();
		System.out.println("Guesser! guess the number");
		Scanner sc=new Scanner(System.in);
		guess1=sc.nextInt();
		System.out.println("Player1 ! guess the number");
		
		System.out.println("You have only 5 tries");
		System.out.println();
		
		for(int i=0;i<tries;i++)
		{
			System.out.println("**********************");
			System.out.println("Enter guessed number");
			num1=sc.nextInt();
			if(num1==guess1)
			{
				System.out.println("HURRAYY!! YOU WON ");
				if(num1!=guess1 && tries!=5)
				{
					continue;
				}
				else
				{
					break;
				}
			}
		}
			if(num1!=guess1)
			{
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				System.out.println("Player 2! You get the chance now");
				for(int i=0;i<tries;i++)
				{
					System.out.println("Player 2: Enter guessed number");
					num2=sc.nextInt();
					if(num2==guess1)
					{
						System.out.println("Yeahh !! You won");
						break;
					}
					else if(num2!=guess1)
					{
						continue;
					}
					
				}
				if(num2!=guess1)
				{
					System.out.println();
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println("Player 3! You get the chance now");
					for(int i=0;i<tries;i++)
					{
						System.out.println("Player 3: Enter guessed number");
						num3=sc.nextInt();
						if(num3==guess1)
						{
							System.out.println("Yeahh !! You won");
							break;
						}
						else if(num3!=guess1)
						{
							continue;
						}
						
					}
			
				
			}
			}
		
		/*System.out.println();
		System.out.println("Player 2 ! guess the number");
		
		System.out.println("you have only 5 tries");
		for(int i=0;i<tries;i++)
		{
			System.out.println("enter guessed number");
			num2=sc.nextInt();
			if(num2==guess1)
			{
				System.out.println("correct");
				break;
			}
			else if(num2!=guess1)
			{
				continue;
			}
			
		}
		
		System.out.println();
		System.out.println("Player 3 ! guess the number");
		
		System.out.println("you have only 5 tries");
		for(int i=0;i<tries;i++)
		{
			System.out.println("enter guessed number");
			num3=sc.nextInt();
			if(num3==guess1)
			{
				System.out.println("correct");
				break;
			}
			else if(num3!=guess1)
			{
				continue;
			}
			else
			{
				System.out.println("The turn goes to Player 3");
			}
		}
		if(guess1!=num1 && guess1!=num2 && guess1!=num3)
		{
			System.out.println("None of you won the game :(");
		}*/
}

}
public class Guessergame2 {
	public static void main(String[] args) {
		player1 p=new player1();
		p.guesserguessnum();
		
	}

	}
