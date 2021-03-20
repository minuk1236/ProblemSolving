import java.util.*;

public class Q4948 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean[] arr = new boolean[2 * 123456 + 1];
		Arrays.fill(arr, true);
		arr[1] = false;

		int len = arr.length;

		for (int i = 2; i <= Math.sqrt(len); i++) {
			if (arr[i] == true) {
				int j = 2;
				while (i * j <= len) {
					arr[i * j] = false;
					j += 1;
				}
			}
		}

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			int count = 0;
			for (int i = n + 1; i <= 2 * n; i++) {
				if (arr[i]) {
					count += 1;
				}
			}
			System.out.println(count);

		}

	}

}
