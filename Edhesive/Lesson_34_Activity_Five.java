import java.util.Scanner;

class Lesson_34_Activity_Five {

	public static int sumEven(int[] a) {
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				total += a[i];
			}
		}
		return total;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4 };
		System.out.println(sumEven(numbers));
	}
}