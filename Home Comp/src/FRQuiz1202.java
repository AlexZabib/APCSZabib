
public class FRQuiz1202 
{
	public static void main(String args[])
	{
		double l1[]= {2,4,6};
		System.out.println(getMean(l1));
	}
	public static double getMean(double[] list)
	{
		double total = 0;
		double num = list.length;
		
		for(int i = 0; i<list.length; i++)
		{
			total = total + list[i];
		}
		return total/num;
	}
}
