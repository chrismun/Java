class Lesson_32_Activity_Four {

	public static void realTime(int x) {
		int minutes = 0;
		int hours = 0;

		while (x >= 60) {
			x = x - 60;
			minutes++;
		}

		while (minutes >= 60) {
			minutes = minutes - 60;
			hours++;
		}
		System.out.println("Seconds: " + x);
		System.out.println("Minutes: " + minutes);
		System.out.println("Hours: " + hours);
	}

	public static void main(String[] args) {
		realTime(123);
	}
}