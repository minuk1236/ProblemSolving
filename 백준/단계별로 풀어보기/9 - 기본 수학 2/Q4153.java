import java.util.*;

public class Q4153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			if (a == 0 && b == 0 && c == 0) {
				break;
			}

			if (check(a, b, c)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}

	}

	public static boolean check(int a, int b, int c) {
		double powA = Math.pow(a, 2);
		double powB = Math.pow(b, 2);
		double powC = Math.pow(c, 2);

		boolean result = false;

		if (powA == (powB + powC)) {
			result = true;
		} else if (powB == (powA + powC)) {
			result = true;
		} else if (powC == (powA + powB)) {
			result = true;
		}

		return result;

	}
}
