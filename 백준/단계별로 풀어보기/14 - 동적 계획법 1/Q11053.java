import java.util.*;

public class Q11053 {
	public static int n;
	public static int[] arr, d;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		d = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.fill(d, 1);

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) {
					d[i] = Math.max(d[i], d[j] + 1);
				}
			}
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans = Math.max(ans, d[i]);
		}
		System.out.println(ans);
	}

}
