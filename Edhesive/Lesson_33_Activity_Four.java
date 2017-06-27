import java.util.Scanner;

class Lesson_33_Activity_Four {

	public static void reverse(int validData[]) {
		for (int i = 0; i < validData.length / 2; i++) {
			int temp = validData[i];
			validData[i] = validData[validData.length - i - 1];
			validData[validData.length - i - 1] = temp;
		}
	}

	public static void main(String[] args) {
		int lst[] = { 1, 4, 7 };
		reverse(lst);
		System.out.println(lst[0]);
	}
}