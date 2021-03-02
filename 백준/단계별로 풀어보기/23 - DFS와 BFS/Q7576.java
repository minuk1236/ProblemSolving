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

public class Q7576 {
	public static int n, m;
	public static int[][] arr;

	public static int[] dx = { -1, 1, 0, 0 };
	public static int[] dy = { 0, 0, -1, 1 };

	public static void bfs() {
		Queue<Node> q = new LinkedList<Node>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 1) {
					q.offer(new Node(i, j));
				}
			}
		}

		while (!q.isEmpty()) {
			Node node = q.poll();
			int x = node.getX();
			int y = node.getY();

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
					continue;
				}

				if (arr[nx][ny] != 0) {
					continue;
				}

				arr[nx][ny] = arr[x][y] + 1;
				q.offer(new Node(nx, ny));
			}
		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 0) {
					System.out.println(-1);
					return;
				}

				max = Math.max(max, arr[i][j]);
			}
		}
		System.out.println(max - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		m = sc.nextInt();
		n = sc.nextInt();

		arr = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		bfs();

	}

}
