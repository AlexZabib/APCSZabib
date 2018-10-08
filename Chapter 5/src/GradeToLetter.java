
public class GradeToLetter {

	public static void main(String[] args) {
		int grade = 85;
		System.out.print("Your grade for the quarter: ");
		if (grade >=90) {
			System.out.println("A");
		}
		else if (grade <90 && grade >=80)
		{
			System.out.println("B");
		}
		else if (grade <80 && grade >=70)
		{
			System.out.println("C");
		}
		else
		{
			System.out.println("F");
		}
	}

}
