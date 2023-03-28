// Task_2.
// Вводится число n, затем n чисел целых, по одному на каждой строке. Затем вводится число, на которое нужно умножить все введённые выше числа. Выведите на экран результат умножения построчно.
// Sample Input:
// 4
// 1
// 2
// 3
// 5
// 2
// Sample Output:
// 2
// 4
// 6
// 10

import java.util.Scanner;

public class task_2 {
	public static void main(String[] args) {

		Scanner iScanner = new Scanner(System.in);
		System.out.printf("Количество чисел: ");
		int lenArr = iScanner.nextInt();

		int[] arrNum = new int[lenArr];
		for (int i = 0; i < arrNum.length; i++) {
			System.out.printf("Введите " + (i + 1) + "-е число: ");
			arrNum[i] = iScanner.nextInt();
		}

		System.out.printf("Введите коэффициент умножения: ");
		int coeff = iScanner.nextInt();
		System.out.println("Результат: ");
		for (int i = 0; i < arrNum.length; i++) {
			System.out.println(coeff * arrNum[i]);
		}
	}
}
