package lesson_6;

public class Doctor extends Human {
	boolean canHeal; // false
	
	public Doctor(String n, String sn, int a, boolean ch) {
		super(n, sn, a);
		this.canHeal = ch;
		showInfo();
	}
	
	@Override
	public void showInfo() {
		System.out.println(
				"Name: " + this.name + ", "
				+ "Surname: " + this.surname + ", "
				+ "Age: " + this.age + ", "
				+ "Can heal: " + this.canHeal
		);
	}
}
