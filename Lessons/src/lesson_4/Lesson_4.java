package lesson_4;

import java.util.Random;

public class Lesson_4 {
	public static void main(String[] args) {
		
		// Тип Идентификатор Значение
		int a = 5;
		
		// (a - z)(A - Z)(0 - 9)(_, $)
		
//		int 9age = 5; // error
//		int a9ge = 5;
		
		// Мы не имеем права создавать в одном пространстве 2 одинаковые переменные
		
//		int b = 5;
//		int b = 10;
		
		// Можно
		
		int c = 5;
		int C = 10;
		
        // String system = ""; // Нельзя использовать зарезервированные слова в качемтве индикаторов
		
		boolean isUserMarriedOnDate25052025ANDHappy = true; // bad
		
		boolean isHappilyMarried = true; // good
		
		// Camel Case
		
		int managerSalary = 56;
		
		// Snake Case
		
		int manager_salary = 50;
		
		// Reserved Words
		
//      public, private, protected — для доступа
//      class, interface, enum — для создания типов
//		static, final, abstract, synchronized
//		void, return, this, super
//		if, else, switch, case, default
//		for, while, do, break, continue
//		int, double, boolean, char и другие типы
//		true, false, null — это тоже зарезервированные значения
//		new, instanceof, extends, implements
//		try, catch, finally, throw, throws
		
		// String methods
		
//		String name = "Alexander ";
//		
//		System.out.println(name.length()); // 10
//		System.out.println(name.toUpperCase()); // "ALEXANDER"
//		System.out.println(name.toLowerCase()); // "alexander"
//		System.out.println(name.charAt(3)); // "x"
//		System.out.println(name.substring(2, 5)); // "exa"
		
		
		// Random numbers
		
//		Random random = new Random();
//		
//		int r = random.nextInt(100) + 10;
//		boolean t = random.nextBoolean(); // true/false
//		
//		System.out.println("Random number: " + r);
//		System.out.println("Random boolean: " + t);
		
		// Constant
		
//		final int MAX_LIVES = 5;
//		
//		System.out.println(MAX_LIVES); // 5
		
		// Operators
		
		// +, -, *, /, --, ++
		// =, -=, +=, *=, /=
		// <=, >=, <, >, ==, !=
		// &&, ||, !
		
		// Побитовые операторы 
		
		// &, |, ^, ~, <<, >>, >>>, <<<
		
		// Ternar operator
		
//		int n = 5;
//		
//		if (n == 10) {
//			System.out.println("Equals 10");
//		} else {
//			System.out.println("Error");
//		}
//		
//		System.out.println(n == 10 ? "Equals 10" : "Error");
		
		// Priority
		
		//1 ++ -- (постфикс)
		//2 ++ -- ! ~ (префикс)
		//3 * / %
		//4 + -
		//5 << >> >>>
		//6 < > <= >=
		//7 == !=
		//8 &
		//9 ^
		//10 &&
		//11 ||
		//12 ?: (тернарный)
		//13 = += -= и т.д.
	}
}
