import java.util.Scanner;

public class AttemptAtTTT
{
	static char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
	//--------------------------------------------------------------------
	public static void main(String[] args) 
	{
		System.out.println("Board locations are as follows");
		System.out.println(" 0 | 1 | 2 ");
		System.out.println("-----------");
		System.out.println(" 3 | 4 | 5 ");
		System.out.println("-----------");
		System.out.println(" 6 | 7 | 8 " +" \n");
			
		printBoard();
		playX();
		printBoard();
		for(int k = 0; k<=3; k++)
			{
				playO();
				printBoard();
				char x = checkW();
				if (x == 'X' || x == 'O')
					{ 
						System.out.println(checkW() + " Wins! Game Over.");
						break;
					}
				playX();
				printBoard();
				char y = checkW();
				if (y == 'X' || y == 'O')
					{ 
						System.out.println(checkW() + " Wins! Game Over.");
						break;
					}
			}
		char x = checkW();
		if(x == 'T')
			{
				System.out.println("Tie. No Winner. Play Again.");
			}
	}
	//----------------------------------------------------------------
	public static void printBoard()
	{
		System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2] + " ");
		System.out.println("-----------");
		System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5] + " ");
		System.out.println("-----------");
		System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8] +" ");
	}
	//----------------------------------------------------------------
	public static char playX() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Pick Location");
		int n = input.nextInt();
		
		if(board[n] == 'O' || board[n] == 'X')
		{
			System.out.println("Invalid Move Pick Again");
			playX();
		}
		else 
			return board[n] = 'X';
		
		return board[n] = board[n];
	}
	//----------------------------------------------------------------
	public static char playO()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Pick Location");
		int n = input.nextInt();

		if(board[n] == 'O' || board[n] == 'X')
		{
			System.out.println("Invalid Move Pick Again");
			playO();
		}
		else 
			return board[n] = 'O';
		
		return board[n] = board[n];
	}
	//----------------------------------------------------------------
	public static char checkW()
	{
		String line1 = "" + board[0] + board[1] + board[2];
		String line2 = "" + board[3] + board[4] + board[5];
		String line3 = "" + board[6] + board[7] + board[8];
		String line4 = "" + board[0] + board[3] + board[6];
		String line5 = "" + board[1] + board[4] + board[7];
		String line6 = "" + board[2] + board[5] + board[8];
		String line7 = "" + board[0] + board[4] + board[8];
		String line8 = "" + board[2] + board[4] + board[6];
		
		if(line1.equals("XXX"))
			return 'X';
		else if(line2.equals("XXX"))
			return 'X';
		else if(line3.equals("XXX"))
			return 'X';
		else if(line4.equals("XXX"))
			return 'X';
		else if(line5.equals("XXX"))
			return 'X';
		else if(line6.equals("XXX"))
			return 'X';
		else if(line7.equals("XXX"))
			return 'X';
		else if(line8.equals("XXX"))
			return 'X';
		else if(line1.equals("OOO"))
			return 'O';
		else if(line2.equals("OOO"))
			return 'O';
		else if(line3.equals("OOO"))
			return 'O';
		else if(line4.equals("OOO"))
			return 'O';
		else if(line5.equals("OOO"))
			return 'O';
		else if(line6.equals("OOO"))
			return 'O';
		else if(line7.equals("OOO"))
			return 'O';
		else if(line8.equals("OOO"))
			return 'O';
		else
			return 'T';
	}
}
