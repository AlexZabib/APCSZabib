
public class Ex1105 {
	public static void main(String args[])
	{
		int a = 0;
		int b = 2;
		for (int k = 0; k < 4; k++)
		{
			a = k;
			b += k;
			while (a < b)
			{
				System.out.println(a + " " + b);
				a += b;
				b += k;
			}
		}
	}

}
