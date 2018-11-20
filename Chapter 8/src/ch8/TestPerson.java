package ch8;

public class TestPerson {

	public static void main(String[] args)
	{
		Person defaultPerson = new Person();
		String n1  = defaultPerson.firstName;
		String n2 = defaultPerson.secondName;
		int a = defaultPerson.age;
		
		System.out.println(n1 + n2 + ": " + a);
		
		Person p2 = new Person("Alex", "Zabib", 16);
		System.out.println(p2.firstName + " " + p2.secondName + ": " + p2.age);
	
		Student s1 = new Student("Alex", "Zabib", 16, 1207821, 3.7);
		System.out.println(s1.firstName + " " + s1.secondName + "; Age: " + s1.age + "; ID: " + s1.id + "; GPA: " + s1.gpa + ";");
		
		
		
	}
	
}
