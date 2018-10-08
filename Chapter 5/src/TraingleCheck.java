import java.util.Scanner;

public class TraingleCheck {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st Side  ===>>  ");										
		int number1 = input.nextInt();
		System.out.print("Enter 2nd Side  ===>>  ");										
		int number2 = input.nextInt();
		System.out.print("Enter 3rd Side  ===>>  ");										
		int number3 = input.nextInt();
	
		if (number1 == number2 && number2 == number3)
		{
			System.out.println("Your traingle is Equilateral");
		}
		else if (number1 == number2 || number2 == number3 || number1 == number3) {
			System.out.println("Your traingle is isosceles");
		}
		else
		{
			System.out.println("Your traingle is scalene");
		}
	}

}
