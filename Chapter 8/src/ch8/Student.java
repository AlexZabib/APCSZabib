package ch8;

public class Student extends Person {

	int id;
	double gpa;
	
	public Student(String first, String last, int age, int i, double g)
	{
		super(first, last, age);
		id = i;
		gpa = g;
	}
}
