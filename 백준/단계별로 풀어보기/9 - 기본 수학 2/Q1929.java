import java.util.*;

public class Q1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		boolean[] arr = new boolean[n + 1];
		Arrays.fill(arr, true);
		arr[1] = false;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (arr[i] == true) {
				int j = 2;
				while (i * j <= n) {
					arr[i * j] = false;
					j += 1;
				}
			}
		}

		for (int i = m; i <= n; i++) {
			if (arr[i]) {
				System.out.println(i);
			}
		}

	}

}
