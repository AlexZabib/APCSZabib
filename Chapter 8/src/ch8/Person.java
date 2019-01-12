package ch8;

public class Person {
	
	String firstName;
	String secondName;
	int age;
	
	
	//constructor
	public Person() {
		firstName = "John";
		secondName = " Doe";
		age = 39;
	}
	
	public Person(String fn, String ln, int a)
	{
		firstName = fn;
		secondName = ln;
		age = a;
	}
}
