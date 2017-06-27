import java.util.Scanner;

class Lesson_34_Activity_Four {

	public static int findMin(int[] a) {
		int smallest = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < smallest) {
				smallest = a[i];
			}
		}
		return smallest;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4 };
		System.out.println(findMin(numbers));
	}
}