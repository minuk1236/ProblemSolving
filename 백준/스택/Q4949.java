package baekjoon;

/*
 * 백준 균형잡힌 세상 문제 - 4949번
 * */
import java.util.*;

public class Q4949 {

	public static Stack<Character> s = new Stack<Character>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String str = sc.nextLine();
			if (str.equals("."))
				break;

			char[] c = str.toCharArray();

			if (check(c)) {
				System.out.println("yes");
			} else
				System.out.println("no");

			s.clear();

		}

	}

	public static boolean check(char[] c) {
		boolean result = false;

		for (int i = 0; i < c.length; i++) {
			switch (c[i]) {
			case '(':
			case '[':
				s.add(c[i]);
				break;
			case ')':
				if (!s.isEmpty() && s.peek() == '(')
					s.pop();
				else
					return false;

				break;
			case ']':
				if (!s.isEmpty() && s.peek() == '[')
					s.pop();
				else
					return false;

				break;

			}
		}

		if (s.isEmpty()) {
			result = true;
		} else
			result = false;

		return result;
	}

}
