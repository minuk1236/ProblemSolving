import java.util.*;

public class Q4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt();

		while (c-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];

			int sum = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}

			double avg = sum / n;
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (arr[i] > avg) {
					count += 1;
				}
			}
			System.out.format("%.3f%%", ((double) count / (double) n) * 100);
			System.out.println();
		}

	}

}
