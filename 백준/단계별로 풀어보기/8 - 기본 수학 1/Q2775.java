import java.util.*;

public class Q2775 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {
			int k = sc.nextInt();
			int n = sc.nextInt();

			int[][] arr = new int[15][15];

			for (int i = 1; i < 15; i++) {
				arr[0][i] = i;
			}

			// 층
			for (int i = 1; i <= k; i++) {
				// 호
				for (int j = 1; j <= n; j++) {
					if (j == 1) {
						arr[i][j] = arr[i - 1][j];
					} else {
						arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
					}

				}
			}

			System.out.println(arr[k][n]);
		}

	}

}
