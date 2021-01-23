import java.util.*;

public class Q2468 {
	public static int n;
	public static int[][] map;
	public static int[][] newMap;

	public static int maxArea = 0;

	public static boolean dfs(int x, int y) {
		if (x < 0 || x >= n || y < 0 || y >= n) {
			return false;
		}

		if (newMap[x][y] != -1) {
			newMap[x][y] = -1;

			// 상하좌우
			dfs(x - 1, y);
			dfs(x + 1, y);
			dfs(x, y - 1);
			dfs(x, y + 1);

			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		map = new int[n][n];
		newMap = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					newMap[j][k] = map[j][k];
					if (map[j][k] <= i) {
						newMap[j][k] = -1;
					}
				}
			}

			int count = 0;
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					if (dfs(j, k)) {
						count += 1;
					}
				}
			}

			if (maxArea < count) {
				maxArea = count;
			}

		}

		System.out.println(maxArea);
	}

}
