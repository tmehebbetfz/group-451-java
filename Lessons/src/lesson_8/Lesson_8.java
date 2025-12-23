package lesson_8;

import java.util.Scanner;

public class Lesson_8 {
	public static void main(String[] args) {
		// 1
		
//		Scanner sr = new Scanner(System.in);
//		
//		System.out.println("Enter grade: ");
//		int grade = sr.nextInt();
//		
//		if (grade == 5) {
//			System.out.println("Exelent");
//		} else if (grade == 4) {
//			System.out.println("Good");
//		} else if (grade == 3) {
//			System.out.println("Not bad");
//		} else if (grade == 2) {
//			System.out.println("Bad");
//		} else {
//			System.out.println("Not correct grade");
//		}
		
		// 2
		
//		int a = 9;
//		int b = 9;
//		int c = 9;
//		
//		if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
//			if (a % 2 != 0 || b % 2 != 0 || c % 2 != 0) {
//				System.out.println("Yes");
//			}
//		} else {
//			System.out.println("No");
//		}
//		
		// 3
		
		// 1 - 31, 2 - 29, 3 - 28
		
//		Scanner sr = new Scanner(System.in);
//		
//		System.out.println("Enter month number: ");
//		int mNumber = sr.nextInt();
//		
//		switch(mNumber) {
//			case 1 -> System.out.println("31 days");
//			case 2 -> System.out.println("29 days");
//			case 3 -> System.out.println("28 days");
//			default -> System.out.println("Error");
//		}

		
		// 4
		
//		int age = 5;
//		
//		if (age > 0 && age < 12) {
//			System.out.println("Child");
//		} else if (age > 13 && age < 17) {
//			System.out.println("Teen");
//		} else if (age > 18 && age < 59) {
//			System.out.println("Adult");
//		} else if (age >= 60) {
//			System.out.println("Old");
//		}
		
		// 5
		
		Scanner sr = new Scanner(System.in);
		
		System.out.println("Enter 1 number: ");
		int fNumber = sr.nextInt();
		
		System.out.println("Enter 2 number: ");
		int sNumber = sr.nextInt();
		
		System.out.println("Enter action: ");
		String action = sr.next();
		
		
		switch(action) {
			case "+" -> System.out.println(fNumber + sNumber);
			case "-" -> System.out.println(fNumber - sNumber);
			case "*" -> System.out.println(fNumber * sNumber);
			case "/" -> System.out.println(fNumber / sNumber);
		}
	}
}
