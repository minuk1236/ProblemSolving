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

public class Q7562 {
	public static int t, l;

	public static int[][] map;

	// 그림의 왼쪽 위부터 시계방향으로
	public static int[] dx = { -1, -2, -2, -1, 1, 2, 2, 1 };
	public static int[] dy = { -2, -1, 1, 2, 2, 1, -1, -2 };

	public static void bfs(int x, int y) {
		Queue<Node> q = new LinkedList<Node>();
		q.offer(new Node(x, y));
		map[x][y] = 0;

		while (!q.isEmpty()) {
			Node node = q.poll();
			x = node.getX();
			y = node.getY();

			for (int i = 0; i < 8; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				// 범위 내에서
				if (nx >= 0 && nx < l && ny >= 0 && ny < l) {
					if (map[nx][ny] == -1) {
						map[nx][ny] = map[x][y] + 1;
						q.offer(new Node(nx, ny));
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		t = sc.nextInt();

		while (t-- > 0) {
			l = sc.nextInt();
			map = new int[l][l];

			// 시작 좌표
			int sx = sc.nextInt();
			int sy = sc.nextInt();
			// 도착 좌표
			int ex = sc.nextInt();
			int ey = sc.nextInt();

			for (int i = 0; i < l; i++) {
				Arrays.fill(map[i], -1);
			}

			bfs(sx, sy);
			System.out.println(map[ex][ey]);

		}

	}

}
