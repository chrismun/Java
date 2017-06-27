import java.util.ArrayList;

public class Lesson_12_FastStart {

	static ArrayList<String> stuff = new ArrayList<String>();

	public static void main(String[] args) {
		stuff.add("item1");
		stuff.add("item2");
		stuff.add("item3");
		stuff.add("item4");
		stuff.add("item5");
		stuff.add("item6");
		stuff.add("item7");
		stuff.add("item8");
		stuff.add("item9");
		stuff.add("item10");

		for (String item : stuff) {

			System.out.println(item);

		}

	}
}
