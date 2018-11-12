import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		/*boolean ans = isItEven(12);
		System.out.println(ans);
		
		Scanner in = new Scanner(System.in);
		System.out.println("The number your picked is even. Your Number: ");
		int input = in.nextInt();
		System.out.println(isItEven(input));*/
		
		/*Scanner x = new Scanner(System.in);
		System.out.println("Pick a number");
		int y = x.nextInt();
		System.out.println("There are " + howManyEven(y) + " even numbers between 1 and " + y);*/
		
		FizzBuzz();
	}
	
	public static boolean isItEven(int num)
	{
		boolean even = false;
		
		if(num % 2 == 0)
			even = true;
		else 
			even = false;
		
		return even;
	}
	
	//count the number of even numbers between 1 and user input
	public static int howManyEven(int num) 
	{
		int a = 0;
		
		for(int i = 1; i<=num; i++)
			if(i % 2 == 0)
				a++;
			else 
			{}
		
		return a;
	}
	
	public static void FizzBuzz()
	{
		for(int i = 1; i<=100; i++)
		{
			if(i % 3 == 0 && i % 5 == 0)
				System.out.println("(" + i + ")FizzBuzz");
			else if (i % 3 == 0)
				System.out.println("(" + i + ")Fizz");
			else if (i % 5 == 0)
				System.out.println("(" + i + ")Buzz");
			else
				System.out.println(" " + i);
		}
	}

}
