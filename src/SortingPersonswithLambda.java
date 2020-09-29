import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingPersonswithLambda {

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
		
		System.out.println("After sorting------------------------>");
		
		 Collections.sort(persons, (p11, p22) -> { return p11.getName().compareTo(p22.getName());});
		 
		 for (Person p : persons) {
				System.out.println(p.getName());
		 }
	}
}
