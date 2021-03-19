import java.util.*;

public class Q2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n == 1) {
			System.out.println(1);
		} else {
			int count = 1;

			for (int i = 2; i <= n;) {
				i += 6 * count;
				count += 1;
			}

			System.out.println(count);
		}

	}

}
