
public class TextLab002v80 {

	public static void main(String[] args) {
		System.out.println("TextLab02, 80 Point Version\n");
		
		
		System.out.print("Starting Seconds: ");
		System.out.println(10000); //prints number (seconds)
		
		System.out.print("Hours: ");
		System.out.println(10000/3600); //divides and prints hours
		
		System.out.print("Minutes: ");
		System.out.println(10000%3600/60); //remainder in minutes
		
		System.out.print("Seconds: ");
		System.out.println(10000%3600%60);
	}

}
