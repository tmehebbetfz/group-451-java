package lesson_6;

public class Human {
	String name; // null
	String surname; // null
	int age; // 0
	
	// constructor
	public Human(String n, String sn, int a) {
		this.name = n;
		this.surname = sn;
		this.age = a;
	}
	
	public void showInfo() {
		System.out.println("Name: " + this.name + ", " + "Surname: " + this.surname + ", " + "Age: " + this.age);
	}
}
