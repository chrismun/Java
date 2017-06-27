import java.util.Scanner;

class Lesson_34_Activity_Two {

	public static double average(int[] a) {
		double total = 0;
		for (double i : a) {
			total += i / a.length;
		}
		return total;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4 };
		System.out.println(average(numbers));
	}
}