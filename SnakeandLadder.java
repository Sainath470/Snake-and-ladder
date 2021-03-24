//"Welcome to the snake and ladder game"
import java.util.*;
public class SnakeandLadder
{
	 public static void main(String args[])
	{
		int STARTPOSITION=0;
		int Player1=STARTPOSITION;
		int Player2=STARTPOSITION;
		int rollDiceCount1=0;
		int rollDiceCount2=0;

		   while((Player1<=100)&&(Player2<=100))
		  	{
					//rolling for player 1
				Random roll1 = new Random();
				int rollDice1= roll1.nextInt(6)+1;
				rollDiceCount1++;
					
					//rolling for player2
					 Random roll2 = new Random();
            int rollDice2= roll2.nextInt(6)+1;
            rollDiceCount2++;

					//options for player 1
				Random opt1 =  new Random();
				int Options1= opt1.nextInt(3);

						//swtich for player1
						switch(Options1)
						{
								case 0: 	Player1=Player1;
											break;
											
												//Ladder
								case 1:  Player1=Player1+rollDice1;
											 Random rollAgain1=new Random();
                                  int LadderRoll1=rollAgain1.nextInt(6)+1;
												Player1=Player1+LadderRoll1;
												rollDiceCount1++;
												break;

											//Snake
								case 2:	Player1=Player1-rollDice1;
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
										Player1=Player1-rollDice1;
								}
								if(Player1==100)
								{
										break;
								}

								//options for player 2
            				Random opt2 =  new Random();
            				int Options2= opt2.nextInt(3);

								  //swtich for player1
         			         switch(Options2)
                  			{
                        			case 0:  Player2=Player2;
                            			     break;
																	
														//Ladder
                        			case 1:  Player2=Player2+rollDice2;
                                 			Random rollAgain2=new Random();
														int LadderRoll2=rollAgain2.nextInt(6)+1;
														Player2+=LadderRoll2;
														rollDiceCount2++;
														break;
														
														//snake
                        			case 2:  Player2=Player2-rollDice2;
                                 			break;

                        			default:  System.out.println("Invalid");
                                 			 break;
                  			}

                        if(Player2<0)
                        {
                              Player2=STARTPOSITION;
                        }

                        if(Player2>100)
                        {
                              Player2=Player2-rollDice2;
                        }
                        if(Player2==100)
                        {
                              break;
                        }
					}
								if(Player1==100)
								{
											System.out.println("Player1 wins ");
								}
								else if(Player2==100)
								{
											System.out.println("Player2 wins");
								}

		}
}
