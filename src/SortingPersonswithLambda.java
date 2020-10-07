import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortingPersonswithLambda {

	public static void main(String[] args) {

		Person p1 = new Person("abc", "test@gmail.com");
		Person p2 = new Person("xyz", "test1@gmail.com");
		Person p3 = new Person("test", "lucky@gmail.com");
		Person p4 = new Person("testing", "test@yahoo.com");

		List<Person> persons = new ArrayList<>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);

		for (Person p : persons) {
			System.out.println(p.getName());
		}

		System.out.println("After sorting------------------------>");

		Collections.sort(persons, (p11, p22) -> {
			return p11.getName().compareTo(p22.getName());
		});	
		
		persons.forEach(personObj -> {
			System.out.println(personObj.getName());
		});
		
		List<String> names = persons.stream()
				.filter(p -> p.getEmail().contains("yahoo"))
				.map(person -> person.getName())
				.collect(Collectors.toList());
		
		System.out.println("--------------------------");
		names.stream().forEach(System.out::println);
		names.forEach( n -> System.out.println(n));
		
		//--------------Without Java 8
		final Map<String, Person> personsMap = new HashMap<>();
		persons.forEach(p -> {
			personsMap.put(p.getName(), p);
		});
		
		//---------------- With java 8
		Map<String, Person> personsMap1 = persons.stream()
				.collect(Collectors.toMap(Person::getName, Function.identity()));
	}
}
