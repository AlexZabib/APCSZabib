
public class Ex1104 {

	public static void main(String[] args) {
		int a = 2, b = 3, c = 4, d = 5;
		while (a < b || c < d)
		{
			a = c + d;
			c = a + b;
		}
		System.out.println(a + " " + b + " " + c + " " + d);

	}

}
