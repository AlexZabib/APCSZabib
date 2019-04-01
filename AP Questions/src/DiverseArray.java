
public class DiverseArray {

	public static void main(String[] args) {
		/*
		int arr1[] = {1,3,2,7,3};
		int arr2[][] = {{1,2,3,4,5,6,7,8,9},
						{1,2,3,4,5,6,7,8,9},
						{1,2,3,4,5,6,7,8,0}
					   };
		arraySum(arr1);
		
		int[] ans = rowSum(arr2);
		for(int i = 0; i<ans.length;i++)
		{
			System.out.println(ans[i] + " ");	
		}
		
		System.out.println(isDiverse(arr2));*/
		System.out.println(biggest(3,3,2));
		
		int[][] numbers = {{1, 2, 3},
				 {4, 5, 6}}; 
		
		for (int[] row : numbers)
		{
		 for (int n : row)
		 {
		 System.out.print(n);
		 }
		}
	
	}
	/*public static void arraySum(int[] a1) 
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
		int[] a2 = new int [a1.length];
		int sum = 0;
		for(int i = 0; i<a1.length; i++)
		{
			for(int k = 0; k<a1[i].length; k++)
			{
				sum = sum + a1[i][k];
			}
			a2[i] = sum;
			sum = 0;
		}
		return a2;
	}
	
	
	
	public static boolean isDiverse(int[][] a2)
	{
		int[] ans = rowSum(a2);
		for(int i = 0; i<ans.length;i++)
			for(int k = i+1; k<ans.length; k++)
					if(ans[i] == ans[k])
						return false;
		return true;
	}*/
	
	public static int biggest(int a, int b, int c)
	{
	 if ((a > b) && (a > c))
	 {
	 return a;
	 }
	 else if ((b > a) && (b > c))
	 {
	 return b;
	 }
	 else
	 {
	 return c;
	 }
	}

}
