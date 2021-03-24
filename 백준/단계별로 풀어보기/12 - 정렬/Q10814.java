import java.util.*;

class Person implements Comparable<Person> {
	private int day;
	private int age;
	private String name;

	public Person(int day, int age, String name) {
		this.day = day;
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Person o) {
		if (this.age == o.age) {
			return Integer.compare(this.day, o.day);
		}

		return Integer.compare(this.age, o.age);
	}
}

public class Q10814 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ArrayList<Person> persons = new ArrayList<Person>();

		int day = 1;

		for (int i = 0; i < n; i++) {
			int age = sc.nextInt();
			String name = sc.next();

			persons.add(new Person(day++, age, name));
		}

		Collections.sort(persons);

		for (Person p : persons) {
			System.out.println(p.getAge() + " " + p.getName());
		}

	}

}
