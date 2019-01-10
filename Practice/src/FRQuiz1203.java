
public class FRQuiz1203 
{
	public static void main(String[] args) 
	{
		int list[] = {2,4,9,6};
		System.out.println(getMax(list));
		int t[] = {-1,-19,-28,-6,-10};
		System.out.println(getMax(t));
	}
	public static int getMax(int[] a)
	{
		int max = a[0];
		for(int i = 1; i<a.length; i++)
		{
			if (a[i] > max)
			{
				max = a[i];;
			}
		}
		return max;
	}
}
