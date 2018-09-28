
public class TextLab002v100 {

	public static void main(String[] args) {
		System.out.println("TextLab02, 100 Point Version\n");
		
		
		System.out.print("Starting Milliseconds: ");
		System.out.println(10000123); //prints number (seconds)
		
		System.out.print("Hours: ");
		System.out.println(10000123/3600000); //divides and prints hours
		
		System.out.print("Minutes: ");
		System.out.println(10000123%3600000/60000); //remainder in minutes
		
		System.out.print("Seconds: ");
		System.out.println(10000123%3600000%60000/1000);

		System.out.print("Milliseconds:");
		System.out.println(10000123%3600000%60000%1000);
	}

}
