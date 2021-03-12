import java.util.*;

public class Q11054 {
	public static int n;
	public static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// 증가하는 부분수열
		int[] d = new int[n];
		Arrays.fill(d, 1);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) {
					d[i] = Math.max(d[i], d[j] + 1);
				}
			}
		}

		// 감소하는 부분수열
		int[] d2 = new int[n];
		Arrays.fill(d2, 1);

		for (int i = n - 1; i >= 0; i--) {
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[i]) {
					d2[i] = Math.max(d2[i], d2[j] + 1);
				}
			}
		}

		int ans = d[0] + d2[0] - 1;
		for (int i = 0; i < n; i++) {
			ans = Math.max(ans, d[i] + d2[i] - 1);
		}
		System.out.println(ans);
	}

}
