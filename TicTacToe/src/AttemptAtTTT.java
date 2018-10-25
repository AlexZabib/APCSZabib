import java.util.Scanner;

public class AttemptAtTTT
{
	static char[][] board = {
			{' ', ' ', ' '},
			{' ', ' ', ' '},
			{' ', ' ', ' '}
	};
	
	public static void main(String[] args) 
	{
			System.out.println("Columns go from 0 to 2 and Rows go from 0 to 2. 0,0 is Top Left and 2,2 is Bottom Right.");
			
			printBoard();
			for(int k = 0; k<=5; k++)
			{
				cycle();
					
			}
			
		}
	
	public static void printBoard()
	{
		System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " ");
		System.out.println("-----------");
		System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " ");
		System.out.println("-----------");
		System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] +" ");
	}
	public static char playX() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Pic x Location");
		int x = input.nextInt();
		System.out.println("Pic y Location");
		int y = input.nextInt();
		
		
		return board[x][y] = 'X';
		
		
	}
	public static char playY()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Pic x Location");
		int x = input.nextInt();
		System.out.println("Pic y Location");
		int y = input.nextInt();
		return board[x][y] = 'Y';
	}
	public static void cycle()
	{
		playX();
		printBoard();
		playY();
		printBoard();
	}
	/*public static char checkW()
	{
	}*/
	
	
	
}
