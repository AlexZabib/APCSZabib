import java.awt.*;
import java.applet.*;
import java.util.Scanner;	

public class AttemptAtTTT extends Applet
{

	public static void main(String[] args) 
		{
			System.out.println("Spot on TTT Board is respective to: ");
			System.out.println("1    2    3");
			System.out.println("4    5    6");
			System.out.println("7    8    9");
		
		}
	
	public void paint(Graphics g)
		{
			board.drawBoard(g);
			//move.drawX(g);
			//check.checkSq();
			//move.drawO(g);
			//check.checkSq();
			
		}

	static class board
		{		
			public static void drawBoard(Graphics g)
			{
				g.setColor(Color.blue);
				g.drawRect(10, 10, 300, 300);
				g.drawLine(110, 10, 110, 310);
				g.drawLine(210, 10, 210, 310);
				g.drawLine(10, 110, 310, 110);
				g.drawLine(10, 210, 310, 210);
			}	
		}
	
	static class move
		{
			public static void drawX(Graphics g)
			{
				
			}
		
			public static void drawO(Graphics g)
			{
			
			}
		}
	static class check
		{
		 public static void checkSq(int a)
		 	{
			 
		 	}
		 public static void checkWX(int a)
		 	{
			 
		 	}
		 public static void checkWO(int a)
		 	{
			 
		 	}
		 public static void checkTie(int a)
		 	{
			 
		 	}
		}
}
