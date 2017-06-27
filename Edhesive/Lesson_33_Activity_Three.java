import java.util.Scanner;

class Lesson_33_Activity_Three {

	public static void printit(int x[]) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}

	public static void main(String[] args) {
		int lst[] = { 1, 4, 7 };
		printit(lst);
	}
}