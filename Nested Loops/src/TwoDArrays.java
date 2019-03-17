import java.util.*;

public class TwoDArrays {

	public static void main(String[] args) {
		

		int count = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows     --> ");                 
		int numRows = input.nextInt();
		System.out.print("Enter the number of columns --> ");
		int numCols = input.nextInt();                       
		System.out.println("\n");
		
		int a1[][] = new int[numRows][numCols];

		
		for (int row = 0; row < numRows; row++) 
		{
			for (int col = 0; col < numCols; col++) 
			{
				count++;
				a1[row][col] = count;
				System.out.print(a1[row][col] + " ");
			}
			System.out.println("");
		}
	}
}
