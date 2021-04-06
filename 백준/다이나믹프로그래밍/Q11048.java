import java.util.*;

public class Q11048 {
	public static int m, n;
	public static int[][] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		int[][] map = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		dp = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				dp[i][j] = map[i][j];
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int left, up, leftUp;

				if (i == 0) {
					leftUp = 0;
					up = 0;
				} else {
					leftUp = j == 0 ? 0 : dp[i - 1][j - 1];
					up = dp[i - 1][j];
				}

				if (j == 0) {
					left = 0;
				} else {
					left = dp[i][j - 1];
				}

				dp[i][j] = dp[i][j] + Math.max(left, Math.max(leftUp, up));
			}
		}

		System.out.println(dp[n - 1][m - 1]);

	}

}
