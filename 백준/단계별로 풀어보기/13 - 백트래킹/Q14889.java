import java.util.*;

public class Q14889 {
	public static int n;
	public static int[][] arr;
	public static boolean[] visited;

	public static int min = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		arr = new int[n][n];
		visited = new boolean[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		backtaracking(0, 0);

		System.out.println(min);
	}

	public static void backtaracking(int idx, int count) {
		if (count == n / 2) {
			min = Math.min(min, diff());
			return;
		}

		for (int i = idx; i < n; i++) {
			if (visited[i])
				continue;

			visited[i] = true;
			backtaracking(i + 1, count + 1);
			visited[i] = false;
		}
	}

	public static int diff() {
		int first = 0;
		int second = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (visited[i] && visited[j]) {
					first += arr[i][j];
					first += arr[j][i];
				} else if (!visited[i] && !visited[j]) {
					second += arr[i][j];
					second += arr[j][i];
				}
			}
		}

		return Math.abs(first - second);

	}
}
