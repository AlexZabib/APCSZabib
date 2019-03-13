
public class Ex1110 {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 25;
		while (a < b || b < c)
		{
			a += 3;
			b += 2;
			c -= 3;
		}
		System.out.println(a + " " + b + " " + c);

	}

}
