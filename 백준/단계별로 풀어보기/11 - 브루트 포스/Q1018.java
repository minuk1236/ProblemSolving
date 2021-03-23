import java.util.*;

public class Q1018 {
	public static int min = 64;

	public static void count(char[][] map, int x, int y) {
		int endRow = x + 8;
		int endCol = y + 8;

		int count = 0;
		// 첫번째 색
		char c = map[x][y];

		for (int i = x; i < endRow; i++) {
			for (int j = y; j < endCol; j++) {
				if (map[i][j] != c) {
					count += 1;
				}

				if (c == 'W') {
					c = 'B';
				} else {
					c = 'W';
				}
			}
			if (c == 'W') {
				c = 'B';
			} else {
				c = 'W';
			}
		}

		count = Math.min(count, 64 - count);
		min = Math.min(min, count);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();

		char[][] map = new char[n][m];

		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = str.charAt(j);
			}
		}

		int row = n - 7;
		int col = m - 7;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				count(map, i, j);
			}
		}

		System.out.println(min);

	}

}
