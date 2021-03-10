import java.util.*;

public class Q1149 {
	public static int n;
	public static int[][] cost = new int[1001][3];
	public static int[][] d = new int[1001][3];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < 3; j++) {
				cost[i][j] = sc.nextInt();
			}
		}

		for (int i = 1; i <= n; i++) {
			// RED
			d[i][0] = Math.min(d[i - 1][1], d[i - 1][2]) + cost[i][0];
			// GREEN
			d[i][1] = Math.min(d[i - 1][0], d[i - 1][2]) + cost[i][1];
			// BLUE
			d[i][2] = Math.min(d[i - 1][0], d[i - 1][1]) + cost[i][2];
		}

		int ans = Math.min(d[n][0], Math.min(d[n][1], d[n][2]));
		System.out.println(ans);
	}

}
