package lesson_13;

class Person{
	
	// Data or instance variables (aka State).
	String name;
	int age;
	
	// Classes can contain data.
	
	// 1. Data
	// 2. Subroutines (methods).
	
}

public class Application {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name="Joe Blogss";
		person1.age=37;
		
		Person person2 = new Person();
		person2.name="Sarah Smith";
		person2.age=20;
		
		System.out.println(person1.name);
	}

}
