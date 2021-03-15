import java.util.*;

public class Q1065 {
	public static boolean check(int n) {
		if (n >= 1 && n < 100) {
			return true;
		} else if (n == 1000) {
			return false;
		} else {
			// 100의 자리
			int a = n / 100;
			// 10의 자리
			int b = (n % 100) / 10;
			// 1의 자리
			int c = n % 10;

			if ((a - b) == (b - c)) {
				return true;
			} else {
				return false;
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (check(i)) {
				count += 1;
			}
		}
		System.out.println(count);
	}

}
