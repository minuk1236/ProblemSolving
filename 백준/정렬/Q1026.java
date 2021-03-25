import java.util.*;

public class Q1026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Integer[] a = new Integer[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		Integer[] b = new Integer[n];
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		Arrays.sort(b, Collections.reverseOrder());

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += (a[i] * b[i]);
		}

		System.out.println(sum);

	}

}
