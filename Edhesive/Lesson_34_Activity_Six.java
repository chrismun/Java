import java.util.Scanner;

class Lesson_34_Activity_Six {

	public static boolean allPositive(int[] a) {
		boolean state = true;
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= 0) {
				state = false;
			}
		}
		return state;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4 };
		System.out.println(allPositive(numbers));
	}
}