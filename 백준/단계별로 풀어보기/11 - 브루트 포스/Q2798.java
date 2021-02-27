import java.util.*;

public class Q2798 {
	public static int n, m;
	public static int max = 0;

	public static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 2; i++) {
			if (arr[i] > m)
				continue;

			for (int j = i + 1; j < n - 1; j++) {
				if (arr[i] + arr[j] > m)
					continue;

				for (int k = j + 1; k < n; k++) {
					int sum = arr[i] + arr[j] + arr[k];

					if (max < sum && sum <= m) {
						max = sum;
					}
				}
			}
		}

		System.out.println(max);

	}

}
