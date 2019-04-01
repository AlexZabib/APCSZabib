
public class FactorialBoi {

	public static void main(String[] args) {
		System.out.println(factorial(6));
		System.out.println(factorialR(6));
	}
	
	public static int factorial(int num) {
		int val = 1;
		for(int i = 1; i <=num; i++)
		{
			val = i*val;
		}
		return val;
	}
	
	public static int factorialR(int num)
	{
		if(num==0)
			return 1;
		else 
			return num*factorialR(num-1);
	}

}
