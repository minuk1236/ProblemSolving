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

public class Q2667 {
	public static int n;

	public static int[][] graph, arr;

	public static int[] dx = { -1, 1, 0, 0 };
	public static int[] dy = { 0, 0, -1, 1 };

	public static void bfs(int x, int y, int count) {
		Queue<Node> q = new LinkedList<Node>();

		q.offer(new Node(x, y));
		arr[x][y] = count;

		while (!q.isEmpty()) {
			Node node = q.poll();
			x = node.getX();
			y = node.getY();

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (0 <= nx && nx < n && 0 <= ny && ny < n) {
					if (graph[nx][ny] == 1 && arr[nx][ny] == 0) {
						q.offer(new Node(nx, ny));
						arr[nx][ny] = count;
					}
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		sc.nextLine();

		graph = new int[n][n];
		arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < n; j++) {
				graph[i][j] = str.charAt(j) - '0';
			}
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (graph[i][j] == 1 && arr[i][j] == 0) {
					bfs(i, j, ++count);
				}
			}
		}

		int[] ans = new int[count];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] != 0) {
					ans[arr[i][j] - 1] += 1;
				}
			}
		}

		Arrays.sort(ans);
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			System.out.println(ans[i]);
		}

	}

}
