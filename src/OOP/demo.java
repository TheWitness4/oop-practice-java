package OOP;

class Person {
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking");
	}
	void eat(){
		System.out.println(name + " is eating");
	}
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}

public class demo {

	public static void main(String[] args) {
		// Instnatiating an object
		Person person1 = new Person();
		
		// Define properties
		person1.name = "Joe";
		person1.email = "joe@email.com";
		person1.phone = "1234567890";
		
		// Abstraction - only use methods needed
		person1.walk();
		person1.sleep();
		person1.eat();
		
		/*
		// Person
		
		// Attributes, variables, adjectives
		String name = "Joe"; 
		String email = "joe@email.com";
		String phone = "5551234567"

		// Action, activity, behavior
		//System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eating");
		
		// binding attributes and properties together
	}
	
	// Enhance by adding functions
	static void walking(){
		System.out.println(name + " is walking");
		*/
	}

}
