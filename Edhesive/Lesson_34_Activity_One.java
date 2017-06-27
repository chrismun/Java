import java.util.Scanner;

class Lesson_34_Activity_One {

	public static int sum(int[] a) {
		int total = 0;
		for (int i : a) {
			total += i;

		}
		return total;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4 };
		System.out.println(sum(numbers));
	}
}