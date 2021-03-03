import java.util.*;

class Node {
	private int x;
	private int y;
	private int z;

	public Node(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}
}

public class Q7569 {
	public static int m, n, h;
	public static int[][][] arr;

	// 상 하 좌 우 위 아래
	public static int[] dx = { -1, 1, 0, 0, 0, 0 };
	public static int[] dy = { 0, 0, -1, 1, 0, 0 };
	public static int[] dz = { 0, 0, 0, 0, 1, -1 };

	public static void bfs() {
		Queue<Node> q = new LinkedList<Node>();

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					if (arr[i][j][k] == 1) {
						q.offer(new Node(j, k, i));
					}
				}
			}
		}

		while (!q.isEmpty()) {
			Node node = q.poll();
			int x = node.getX();
			int y = node.getY();
			int z = node.getZ();

			for (int i = 0; i < 6; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				int nz = z + dz[i];

				if (nx < 0 || nx >= n || ny < 0 || ny >= m || nz < 0 || nz >= h) {
					continue;
				}

				if (arr[nz][nx][ny] != 0) {
					continue;
				}

				arr[nz][nx][ny] = arr[z][x][y] + 1;
				q.offer(new Node(nx, ny, nz));
			}
		}

		int max = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					if (arr[i][j][k] == 0) {
						System.out.println(-1);
						return;
					}
					max = Math.max(max, arr[i][j][k]);
				}
			}
		}
		System.out.println(max - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		h = sc.nextInt();

		arr = new int[h][n][m];

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					arr[i][j][k] = sc.nextInt();
				}
			}
		}

		bfs();

	}

}
