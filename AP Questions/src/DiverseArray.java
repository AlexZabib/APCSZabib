
public class DiverseArray {

	public static void main(String[] args) {
		int arr1[] = {1,3,2,7,3};
		int arr2[][] = {{1,2,3,4,5,6,7,8,9},
						{1,2,3,4,5,6,7,8,0},
						{1,2,3,4,5,6,7,0,0}};
		arraySum(arr1);
		System.out.println(rowSum(arr2));
		
		

	}
	public static void arraySum(int[] a1) 
	{
		int sum = 0;
		for(int i = 0; i < a1.length; i++)
		{
			sum = sum + a1[i];
		}
		System.out.println(sum);
	}
	
	public static int[] rowSum(int[][] a1)
	{
		int rowCount = 0;
		int sum = 0;
		int[] a2 = new int [rowCount];
		for(int i = 0; i<a1.length; i++)
		{
			for(int k = 0; k<a1[i].length; k++)
			{
				sum = sum + a1[rowCount][i];
			}
			a2[i] = sum;
			rowCount++;
		}
		return a2;
	}

}
