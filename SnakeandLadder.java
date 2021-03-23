//"Welcome to the snake and ladder game"
import java.util.*;
public class SnakeandLadder
{
	 public static void main(String args[])
	{
		int STARTPOSITION=0;
		int Player1=STARTPOSITION;

		Random roll = new Random();
		int rollDice= roll.nextInt(6)+1;

		System.out.println(rollDice);

		Random opt =  new Random();
		int Options= opt.nextInt(3);

			switch(Options)
			{
					case 0: 	Player1=Player1;
								System.out.println("You remain at same position");
								break;

					case 1:  Player1=Player1+rollDice;
								System.out.println("Congrats! you got the ladder so moving "+Player1+" steps forward");
								break;

					case 2:	Player1=Player1-rollDice;
								System.out.println("Oops! you got bitten by snake so moving "+Player1+" steps backward");
								break;

				  default:  System.out.println("Invalid");
								break;
			}
	}
}
