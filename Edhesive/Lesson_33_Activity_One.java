import java.util.Scanner;

class Lesson_33_Activity_One {

	public static void upper(String x[]) {
		for (int i = 0; i < x.length; i++) {
			x[i] = x[i].toUpperCase();
			System.out.println(x[i]);
		}
	}

	public static void main(String[] args) {
		String lst[] = { "hello", "world" };
		upper(lst);
	}
}