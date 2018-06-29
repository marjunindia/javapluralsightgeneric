package pluralsightgeneric;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person donDraper = new Person("donDraper", 89);

		Person peggyOlson = new Person("peggyOlson", 69);

		Person bertCooper = new Person("bertCooper", 100);

		List<Person> list = new ArrayList<Person>();
		list.add(donDraper);
		list.add(peggyOlson);
		list.add(bertCooper);

		Collections.sort(list, new AgeComparator());

		System.out.println(list);

		Collections.sort(list, new ReverseComparator<>(new AgeComparator()));

		System.out.println(list);

	}

}
