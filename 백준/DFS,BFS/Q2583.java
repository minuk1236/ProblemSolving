import java.util.*;

class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
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

public class Q2583 {
	public static int m, n, k;
	// 상, 하, 좌, 우
	public static int[] dx = { -1, 1, 0, 0 };
	public static int[] dy = { 0, 0, -1, 1 };

	public static boolean[][] visited;

	// 0인 부분을 다 1로 바꾸고 바꾼 갯수를 반환
	public static int bfs(int[][] map, int x, int y) {
		Queue<Point> q = new LinkedList<>();
		q.offer(new Point(x, y));
		int len = 0;
		visited[x][y] = true;

		while (!q.isEmpty()) {
			Point p = q.poll();
			x = p.getX();
			y = p.getY();
			len += 1;

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
					if (visited[nx][ny] == false && map[nx][ny] == 0) {
						map[nx][ny] = 1;
						visited[nx][ny] = true;
						q.offer(new Point(nx, ny));
					}
				}
			}
		}

		return len;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		k = sc.nextInt();

		int[][] map = new int[m][n];
		visited = new boolean[m][n];

		for (int i = 0; i < k; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();

			int x2 = sc.nextInt();
			int y2 = sc.nextInt();

			for (int j = y1; j < y2; j++) {
				for (int h = x1; h < x2; h++) {
					map[j][h] = 1;
				}
			}
		}
		// 출력
//		print(map);

		int count = 0;
		ArrayList<Integer> len = new ArrayList<Integer>();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 0) {
					count += 1;
					int length = bfs(map, i, j);
					len.add(length);
				}
			}
		}

		// 오름차순 정렬
		Collections.sort(len);

		System.out.println(count);
		for (Integer le : len) {
			System.out.print(le + " ");
		}
	}

	// 배열 출력
	public static void print(int[][] map) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}

}
