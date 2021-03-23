//"Welcome to the snake and ladder game"
import java.util.*;
public class SnakeandLadder
{
	 public static void main(String args[])
	{
		int STARTPOSITION=0;
		int player1=STARTPOSITION;

		Random roll = new Random();
		int rollDice= roll.nextInt(6)+1;
		System.out.println(rollDice);

	}

}
