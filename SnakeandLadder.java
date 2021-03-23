//"Welcome to the snake and ladder game"
import java.util.*;
public class SnakeandLadder
{
	 public static void main(String args[])
	{
		int STARTPOSITION=0;
		int Player1=STARTPOSITION;

		   while(Player1<=100)
		  	{
				Random roll = new Random();
				int rollDice= roll.nextInt(6)+1;

				Random opt =  new Random();
				int Options= opt.nextInt(3);

						switch(Options)
						{
								case 0: 	Player1=Player1;
											break;

								case 1:  Player1=Player1+rollDice;
											break;

								case 2:	Player1=Player1-rollDice;
											break;

				  				default:  System.out.println("Invalid");
											 break;
						}

								if(Player1<0)
								{
										Player1=STARTPOSITION;
								}

								if(Player1>100)
								{
										Player1=Player1-rollDice;
								}
								if(Player1==100)
								{
										break;
								}
			}

			System.out.println("Position of Player is "+Player1);
			System.out.println("Congratulations Player has reached 100 position and won the game");
	}
}
