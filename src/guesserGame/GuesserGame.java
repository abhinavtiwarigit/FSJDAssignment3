package guesserGame;

import java.util.Scanner;

class Game
{
	public int numInMind;
	public int player1Guess;
	public int player2Guess;
	public int player3Guess;
}
class Input extends Game
{
	public void printMessage()
	{
		System.out.println("The names of the players will be kept silent by the panelist.");
		System.out.println();
		System.out.println();
		System.out.println("Names will be revealed at the end");
		System.out.println();
		System.out.println("*******************");
		System.out.println("###################");
		System.out.println();
		System.out.println("Hey Guesser!! Guess the number! Remember not to tell it aloud!");
		Scanner sc= new Scanner(System.in);
		System.out.println("Guesser..ENTER THE NUMBER");
		numInMind=sc.nextInt();
		System.out.println("------------------------------------------------------------------");
	}
	public void playerGuess()
	{
		System.out.println("okay!! The actual Game beginzz!!");
		System.out.println("----Player 1 .. please guess the number----");
		Scanner sc= new Scanner(System.in);
		player1Guess=sc.nextInt();
		System.out.println("okay!! Let's see what others have in mind!!");
		System.out.println("----Player 2 .. please guess the number----");
		player2Guess=sc.nextInt();
		System.out.println("----Player 3 .. please guess the number----");
		player3Guess=sc.nextInt();
	}
}
class GameLogic extends Input
{
	String player1Name;
	String player2Name;
	String player3Name;

	public void playernames()
	{
		System.out.println("Names to be kept secret by panelists ;)");
		Scanner sc=new Scanner(System.in);
		player1Name=sc.next();
		player2Name=sc.next();
		player3Name=sc.next();
	}
	public void gamedemo()
	{
		System.out.println("Lets see who wins the game");
		System.out.println();
		System.out.println();
		if(numInMind==player1Guess && numInMind==player2Guess)
		{
			System.out.println("Player 1 and Player 2 won the game"+ player1Name + " ," + player2Name);
			System.out.println();
		}
		else if(numInMind==player1Guess && numInMind==player3Guess)
		{
			System.out.println("Player 1 and Player 3 won the game" + player1Name + " ," + player3Name);
			System.out.println();
		}
		else if(numInMind==player2Guess && numInMind==player3Guess)
		{
			System.out.println("Player 2 and Player 3 won the game" + player2Name + " ," + player3Name);
			System.out.println();
		}
		else if(numInMind==player1Guess)
		{
			System.out.println("only Player 1 won the game " + player1Name);
			System.out.println();
		}
		else if(numInMind==player2Guess)
		{
			System.out.println("only Player 2 won the game " + player2Name );
			System.out.println();
		}
		else if(numInMind==player3Guess)
		{
			System.out.println("only Player 3 won the game " + player3Name);
			System.out.println();
		}
		else
		{
			System.out.println(); 
			System.out.println();
			System.out.println("ufff!!! None guessed it right");
			System.out.println();
		}
	}
}
public class GuesserGame {

	public static void main(String[] args) {
		
GameLogic i=new GameLogic();
i.printMessage();
i.playerGuess();
i.playernames();
i.gamedemo();

	}

}