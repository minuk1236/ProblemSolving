import java.util.*;

public class Q1012 {
	public static int t, m, n;
	public static int[][] map;

	public static boolean dfs(int x, int y) {
		if (x < 0 || x >= n || y < 0 || y >= m) {
			return false;
		}

		if (map[x][y] == 1) {
			map[x][y] = 0;

			dfs(x - 1, y);
			dfs(x, y - 1);
			dfs(x + 1, y);
			dfs(x, y + 1);

			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		t = sc.nextInt();
		while (t-- > 0) {
			m = sc.nextInt();
			n = sc.nextInt();
			int k = sc.nextInt();

			map = new int[n][m];

			for (int i = 0; i < k; i++) {
				int y = sc.nextInt();
				int x = sc.nextInt();
				map[x][y] = 1;
			}

			int count = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (dfs(i, j)) {
						count += 1;
					}
				}
			}
			System.out.println(count);
		}
	}

}
