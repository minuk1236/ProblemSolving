package baekjoon;

import java.util.*;

class Student implements Comparable<Student> {
	private String name;
	private int korScore;
	private int engScore;
	private int mathScore;

	public Student(String name, int korScore, int engScore, int mathScore) {
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Student o) {
		if (this.korScore == o.korScore && this.engScore == o.engScore && this.mathScore == o.mathScore) {
			return this.name.compareTo(o.name);
		}

		if (this.korScore == o.korScore && this.engScore == o.engScore) {
			return Integer.compare(o.mathScore, this.mathScore);
		}

		if (this.korScore == o.korScore) {
			return Integer.compare(this.engScore, o.engScore);
		}

		return Integer.compare(o.korScore, this.korScore);
	}

}

public class Q10825 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ArrayList<Student> students = new ArrayList<Student>();

		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int korScore = sc.nextInt();
			int engScore = sc.nextInt();
			int mathScore = sc.nextInt();

			students.add(new Student(name, korScore, engScore, mathScore));
		}

		Collections.sort(students);

		for (Student s : students) {
			System.out.println(s.getName());
		}

	}

}
