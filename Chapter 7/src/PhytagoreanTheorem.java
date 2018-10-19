import java.util.Scanner;

public class PhytagoreanTheorem {

	public static void main (String args[]){

		System.out.println("The missing side is " + phyt());
	
	}
	public static double phyt() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("If you don't know a side enter 0");
		System.out.print("Enter A --> ");
		int a = keyboard.nextInt();
		System.out.print("Enter B --> ");
		int b = keyboard.nextInt();
		System.out.print("Enter C --> ");
		int c = keyboard.nextInt();
		if (a == 0) {
			return Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2)); 
		}
		else if (b == 0) {
			return Math.sqrt(Math.pow(c, 2) - Math.pow(a,2));
			
		}
		else if (c == 0) {
			return Math.sqrt(Math.pow(a, 2) + Math.pow(b,  2));

		}
		else {
			return -1;
		}
		
	}
	
	
}
