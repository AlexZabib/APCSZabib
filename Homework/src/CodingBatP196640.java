
public class CodingBatP196640 {

	public static void main(String[] args) 
	{
		int[] a1 = {10, 3, 5, 6};
		int[] a2 = {7, 2, 10, 9};
		int[] a3 = {2, 10, 7, 2};
		
		bigDiff(a1);
		bigDiff(a2);
		bigDiff(a3);
	}
	public static void bigDiff(int[] a)
	{
		int max = 0;
		int min = 0;
		int diff = 0;
		
		for(int i = 0; i<a.length; i++)
		{
			if(a[i] > max)
				max = a[i];		
		}
		min = max;
		for(int i = 0; i<a.length; i++)
		{
			if(a[i] < min)
				min = a[i];		
		}
		diff = max - min;
		System.out.println(diff);
	}
}
