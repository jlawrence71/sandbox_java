package com.jbl.sandbox_java.oo_concepts;

//******************
//JAVA OO Concepts
//******************

/*

1) Class
2) Object
3) Inheritance
4) Polymorphism
5) Abstraction
6) Encapsulation

*/

public class OlDiagram{
	
	public static void main(String[] args) {
		
		System.out.println("Have you been studying the 'Ol Diagram?  Careful now...");
		
		// In OO, we create an Object, which is an instance of a class
		// Student is class, nerd and whoKnows are Objects.
		Student nerd = new Student("Fred");
		Student whoKnows = new Student();
		
		nerd.eat(600);
		nerd.bathe(10);
		nerd.study();
		nerd.sleep(5);
	}
	
}

// **************************************
// These are the OO Classes
// **************************************

class Student extends Person2 implements StudentIfc{
	
	// Polymorphism is having same method with different arguments
	// Polymorphism is a generic term that means 'many shapes'.
	// More Precisely, Polymorphism means the ability to request that the
	// same operations be performed by a wide range of different types of things.
	public Student(String name) {
		super(name);
	}
	
	public Student() {
		super("Unknown");
	}

	// The StudentIfc 'contract' insists this be defined
	@Override
	public void study() {
		System.out.println("Study, Study, Learn, Learn...");
	}
}

class Person2 extends PersonBase{
	
	private int waterDailyAllowanceMinutes = 15;
	
	public Person2(String name) {
		this.name = name;
	}
	
	// The encapsulation is the inclusion, within a program object, of all the
	// resources needed for the object to function, basically, the methods and the data.
	// Think 'capsule', like a pill
	private String name;
	public String getName() {
		return name;
	}
	
	// This is 'abstract' in PersonBase, so we have to define it for ourselves
	@Override
	void bathe(int minutes) {
		waterDailyAllowanceMinutes -= minutes;
		System.out.println("Hey "+name+", your shower took "+minutes+" minutes.  You have "+waterDailyAllowanceMinutes+" minutes left.");
	}
}


// *******************************************************************
// Types of 'abstraction' include abstract classes and interfaces too
// *******************************************************************

// Implementors must adhere to this 'contract'
interface StudentIfc{
	public void study();
	
}

// Abstraction is a process of hiding the implementation details
// Also, anything marked as 'abstract' forces the class to define those for themselves. (like an interface does)
abstract class PersonBase{
	
	// The extending class cannot touch these
	private int requiredSleepHours = 8;
	private int requiredDailyCaloricIntake = 2000;
	
	protected PersonBase() {
		
	}
	
	protected void eat(int calories) {
		requiredDailyCaloricIntake -= calories;
		System.out.println("Your meal was "+calories+" calories.  You have "+requiredDailyCaloricIntake+" calories left.");
	}
	
	protected void sleep(int hours) {
		requiredSleepHours -= hours;
		System.out.println("You slept "+hours+" hours, but you need "+requiredSleepHours+" more hours of rest.");
	}
	
	// Class which extends must define this
	abstract void bathe(int minutes);
}

