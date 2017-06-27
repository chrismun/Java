import java.util.Scanner;

class Lesson_33_Activity_Two {

	public static void randomize(int x[]) {
		for (int i = 0; i < x.length; i++) {
			x[i] = (int) ((Math.random() * 90) + 10);
			System.out.println(x[i]);
		}
	}

	public static void main(String[] args) {
		int lst[] = { 13, 43, 98 };
		randomize(lst);
	}
}