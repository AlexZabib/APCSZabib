
public class Ex1109 {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		for (int k = 3; k < 10; k++)
		{
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		System.out.println("n3 = " + n3); 

	}

}
