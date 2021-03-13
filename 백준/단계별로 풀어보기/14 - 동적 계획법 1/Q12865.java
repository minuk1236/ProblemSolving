import java.util.*;

public class Q12865 {
	public static int n, k;
	public static int[] w, v;
	public static int[][] d;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		k = sc.nextInt();

		w = new int[n + 1];
		v = new int[n + 1];
		d = new int[n + 1][k + 1];

		for (int i = 1; i <= n; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= k; j++) {
				// i번째 무게를 더 담을 수 없는 경우
				if (w[i] > j) {
					d[i][j] = d[i - 1][j];
				}
				// i번째 무게를 더 담을 수 있는 경우
				else {
					d[i][j] = Math.max(d[i - 1][j], d[i - 1][j - w[i]] + v[i]);
				}
			}
		}
		System.out.println(d[n][k]);

	}

}
