import java.util.*;

class Node {
	private int x;
	private int y;

	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}

public class Q2178 {
	public static int n, m;

	public static int[][] arr;

	public static int[] dx = { -1, 1, 0, 0 };
	public static int[] dy = { 0, 0, -1, 1 };

	public static int dfs(int x, int y) {
		Queue<Node> q = new LinkedList<Node>();

		q.offer(new Node(x, y));

		while (!q.isEmpty()) {
			Node node = q.poll();
			x = node.getX();
			y = node.getY();

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
					continue;
				}

				if (arr[nx][ny] == 0) {
					continue;
				}

				if (arr[nx][ny] == 1) {
					arr[nx][ny] = arr[x][y] + 1;
					q.offer(new Node(nx, ny));
				}
			}
		}

		return arr[n - 1][m - 1];

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();

		arr = new int[n][m];

		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < m; j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}

		System.out.println(dfs(0, 0));

	}

}
