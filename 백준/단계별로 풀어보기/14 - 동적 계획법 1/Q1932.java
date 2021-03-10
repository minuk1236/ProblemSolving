import java.util.*;

public class Q1932 {
	public static int n;

	public static int[][] d = new int[500][500];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				d[i][j] = sc.nextInt();
			}
		}

		// 위에서 2번째 줄부터 시작
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				// 위에서 오는 것, 왼쪽 위에서 오는 것
				int up, leftUp;
				// 왼쪽 위에서 오는 경우
				if (j == 0) {
					leftUp = 0;
				} else {
					leftUp = d[i - 1][j - 1];
				}

				// 위에서 오는 경우
				if (j == i) {
					up = 0;
				} else {
					up = d[i - 1][j];
				}

				d[i][j] = d[i][j] + Math.max(up, leftUp);
			}
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans = Math.max(ans, d[n - 1][i]);
		}

		System.out.println(ans);
	}

}
