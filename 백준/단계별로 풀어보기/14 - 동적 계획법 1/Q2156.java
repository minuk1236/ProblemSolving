import java.util.*;

public class Q2156 {
	public static int n;
	public static int[] arr, d;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		arr = new int[n + 1];
		d = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}

		d[1] = arr[1];
		if (n >= 2)
			d[2] = arr[1] + arr[2];

		for (int i = 3; i <= n; i++) {
			d[i] = d[i - 1];
			d[i] = Math.max(d[i], d[i - 2] + arr[i]);
			d[i] = Math.max(d[i], d[i - 3] + arr[i - 1] + arr[i]);
		}

		System.out.println(d[n]);
	}

}
