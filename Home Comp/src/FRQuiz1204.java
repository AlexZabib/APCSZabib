
public class FRQuiz1204 
{
	public static void main(String args[])
	{
		long fibo[] = new long[100]; //prints 100 numbers in the sequence
		fibo[0] = 0; //declares first number in sequence
		fibo[1] = 1; //declares second number in sequence
		System.out.println(fibo[0] + "\n" + fibo[1]); //print first two numbers of sequence
		for(int i = 2; i<fibo.length; i++) //set up for loop to print all number in sequence from third nuymber to array limit
		{
			System.out.println(computeFibo(fibo, i)); //prints computed fibonacci number
		}
	}
	public static long computeFibo(long[] list, int n)
	{
		int i = n; //takes number of fibonacci code
		list[i] = list[i-1] + list[i-2]; //computes fibonacci # "current = previous + previous of previous"
		return list[i]; //returns fibonacci #
	}
}
