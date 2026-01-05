package lesson_5;

import java.util.Random;

public class Lesson_5 {
	public static void main(String[] args) {
		
		// Идентификаторы
		
		// Начинаются с буквы (a–z, A–Z), знака подчёркивания _ или доллара $.
		// После первого символа могут содержать буквы, цифры (0–9), _ и $.
		// Длина не ограничена (но рекомендуется разумная).
		
		int $ = 5;
		int _a = 45;
		int a9ge9 = 100;
		
		int messi = 5;
		int age = 5;
		
		boolean HeHasMarriedToAWomanNamedJase = true; // bad
		
		// good
		boolean isMarried = true;
		String wifeName = "Jane";
		
		// Java чувствительна к регистру: age и Age — разные идентификаторы.
		
		int c = 5;
		int C = 6;
		
		// Нельзя использовать ключевые слова Java (например, int, class, public).
		
		
		// int age;              // правильно
		// String user_name;     // правильно (snake_case)
		// double $price;        // правильно, но не рекомендуется
		// int _123;             // правильно
		// int 1number;          // ошибка — начинается с цифры
		// int class;            // ошибка — class является ключевым словом
		
		
		// Ключевые слова Java (Keywords)
		
		// abstract, assert, boolean, break, byte, case, catch, char, class, const (не используется), 
		// continue, default, do, double, else, enum, extends, final, finally, float, for, goto (не используется), if, 
		// implements, import, instanceof, int, interface, long, native, new, package, private, protected, public, return, short, 
		// static, strictfp, super, switch, synchronized, this, throw, throws, transient, try, void, volatile, while.
		
		// Примитивные типы (8 штук):
		
		// 1 Целочисленные: byte, short, int, long
		// 2 С плавающей точкой: float, double
		// 3 Символьный: char
		// 4 Логический: boolean
			
		// Ссылочные типы
		
		// 1 Классы (String)
		// 2 Интерфейсы
		// 3 Массивы
		// 4 Перечисления (enum)
		
		// Синтаксис создания переменных
		
		// тип идентификатор = значение
		int a = 5;
		
		int n = 5, m = 10, x = 100;
		
		// Правила именования переменных
		
		// Имена переменных — camelCase: userAge, totalPriceForDinner
		// Имена классов — PascalCase: MyClass
		// Константы — UPPER_SNAKE_CASE: MAX_VALUE
		
		final int SALARY = 500;
		SALARY = 1000;
		
		
		// Имена должны быть осмысленными (не x, temp, а customerName, orderTotal)
		
		int fincode = 56;
		
		
		// _
		
		int num = 100_000_000;
		
		// Генерация случайных чисел
		
		double rand1 = Math.random(); // 0.0 -> 1.0
		int rand2 = (int) Math.random(); // 0 -> 1
		
		Random random = new Random();
		int n1 = random.nextInt(100); // 0 -> 99
		int n2 = random.nextInt(55) + 10; // 10 -> 65
		boolean b1 = random.nextBoolean(); // true/false
		
		
		// Логические операторы
		
		// && (SHIFT + 8) -> и
		// || -> или
		// ! -> не
		
		int a1 = 5;
		int a2 = 10;
		
		//   false
		if (a1 > a2 && a1 == 10) {
			System.out.println("Ok");
		}
		
		//   false       true
		if (a1 > a2 || a1 == 5) {
			System.out.println("Ok");
		}
		
		if (a1 != 5) {
			System.out.println("Ok");
		}
		
		// Тернарный оператор
		
		int a3 = 5;
		
		if (a3 == 5) {
			System.out.println("Ok");
		} else {
			System.out.println("Error");
		}
		
		
		System.out.println(a3 == 5 ? "Ok" : "Error");
		
	}
}
