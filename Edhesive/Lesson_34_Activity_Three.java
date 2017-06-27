import java.util.Scanner;

class Lesson_34_Activity_Three {

	public static int findMax(int[] a) {
		int largest = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				largest = a[i];
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4 };
		System.out.println(findMax(numbers));
	}
}