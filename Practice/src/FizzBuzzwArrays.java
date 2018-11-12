import java.util.Scanner; 

public class FizzBuzzwArrays {

	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Pick a number: ");
		int num = input.nextInt();
		System.out.println("");
		FizzBuzz(num);
	}
	
	public static void FizzBuzz(int num)
	{
		String[] array1 = new String[num+1];
		for(int i = 1; i<array1.length; i++)
		{
			if(i % 3 == 0 && i % 5 == 0)
			{
				array1[i] = "FizzBuzz";
			}
			else if(i % 3 == 0)
			{
				array1[i] = "Fizz";
			}
			else if(i % 5 == 0)
			{
				array1[i] = "Buzz";
			}
			else
			{
				array1[i] = String.valueOf(i);				
			}
			System.out.println(array1[i]);
		}
	}
	
}
