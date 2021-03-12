import java.util.*;

public class Q1912 {
	public static int n;
	public static int[] arr, d;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		d = new int[n];
		d[0] = arr[0];

		for (int i = 1; i < n; i++) {
			d[i] = Math.max(d[i - 1] + arr[i], arr[i]);
		}

		int max = arr[0];
		for (int i = 0; i < n; i++) {
			max = Math.max(max, d[i]);
		}
		System.out.println(max);

	}

}
