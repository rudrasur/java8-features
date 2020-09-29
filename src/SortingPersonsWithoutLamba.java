import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingPersonsWithoutLamba {

	public static void main(String[] args) {
		
		Person p1 = new Person("soori", "test@gmail.com");
		Person p2 = new Person("mounika", "test1@gmail.com");
		Person p3 = new Person("lucky", "lucky@gmail.com");
		
		List<Person> persons = new ArrayList<>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		
		for (Person p : persons) {
			System.out.println(p.getName());
		}
		
		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});
		
		for (Person p : persons) {
			System.out.println(p.getName());
		}
	}
}

