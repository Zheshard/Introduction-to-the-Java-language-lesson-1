// Task_1.
// Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.
// Sample Input:
// 8
// 11
// Sample Output:
// 512
// 1331

import java.util.Scanner;

public class task_1 {
	public static void main(String[] args) {
		int lenArr = 1000;
		int power = 3;
		int[] arrNum = new int[lenArr];
		for (int i = 0; i < arrNum.length; i++) {
			arrNum[i] = (int) Math.pow(i, power);
		}
		Scanner iScanner = new Scanner(System.in);
		System.out.printf("num1: ");
		int num1 = iScanner.nextInt();
		System.out.printf("num2: ");
		int num2 = iScanner.nextInt();
		System.out.println(arrNum[num1]);
		System.out.println(arrNum[num2]);
	}
}
