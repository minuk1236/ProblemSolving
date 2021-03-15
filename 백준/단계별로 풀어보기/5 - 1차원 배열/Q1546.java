import java.util.*;

public class Q1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] arr = new double[n];

		double m = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			m = Math.max(m, arr[i]);
		}

		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += (arr[i] / m) * 100;
		}

		System.out.println(sum / n);

	}

}
