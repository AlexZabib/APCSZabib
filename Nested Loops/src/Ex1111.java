
public class Ex1111 {
	public static void main(String args[]) 
	{
		int a = 9;
		int b = 10;
		int c = 0;
		if (a < b)
			if (b < a)
				c = 2000;
			else
				c = 3500;
		else
			if (b > a)
				c = 2500;
			else
				c = 3500;
		System.out.println("c = " + c);
	}

}
