// Task_3.
// Реализовать простой калькулятор (+,-,=,*), только с целыми числами.

import java.util.Scanner;

public class task_3 {
	public static void main(String[] args) {

		Scanner iScanner = new Scanner(System.in);
		System.out.println("Простой калькулятор");
		System.out.printf("Введите число А: ");
		int numA = iScanner.nextInt();
		System.out.printf("Введите арифметический оператор: ");
		char op = iScanner.next().charAt(0);
		System.out.printf("Введите число B: ");
		int numB = iScanner.nextInt();

		switch (op) {
			case '+':
				System.out.println(numA + numB);
				break;
			case '-':
				System.out.println(numA - numB);
				break;
			case '*':
				System.out.println(numA * numB);
				break;
			case '/':
				System.out.println(numA / numB);
				break;
			default:
				System.out.println("Ошибка");
		}
	}
}
