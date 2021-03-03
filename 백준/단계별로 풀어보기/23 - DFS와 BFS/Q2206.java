import java.util.*;

class Node {
	private int x;
	private int y;
	private int distance;
	// 벽을 부신 횟수
	private int wall;

	public Node(int x, int y, int distance, int wall) {
		this.x = x;
		this.y = y;
		this.distance = distance;
		this.wall = wall;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getDistance() {
		return distance;
	}

	public int getWall() {
		return wall;
	}
}

public class Q2206 {
	public static int n, m;

	public static int[][] arr;
	public static boolean[][][] visited;

	public static int[] dx = { -1, 1, 0, 0 };
	public static int[] dy = { 0, 0, -1, 1 };

	public static void bfs(int x, int y) {
		Queue<Node> q = new LinkedList<Node>();
		q.offer(new Node(x, y, 1, 0));
		visited[x][y][0] = true;
		visited[x][y][1] = true;

		int ans = Integer.MAX_VALUE;

		while (!q.isEmpty()) {
			Node node = q.poll();
			x = node.getX();
			y = node.getY();
			int distance = node.getDistance();
			int wall = node.getWall();

			if (x == n - 1 && y == m - 1) {
				ans = Math.min(ans, distance);
				break;
			}

			/*
			 * 경우의 수 wall == 0 일때 0-1. 벽을 만났고 벽을 부신적이 없는 경우 벽을 부수고 wall = 1로 바꿈 0-2. 벽을 만나지
			 * 않았을 때 그대로 방문처리 후 탐색
			 * 
			 * wall == 1 일때 (이전에 벽을 부순 경우) 1-1. 벽을 만났을 때 , 이미 이전에 벽을 부셔서 탐색 종료 1-2. 벽을 만나지
			 * 않았을 경우 그대로 방문처리 후 탐색
			 */

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				// 범위 내에서
				if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
					// 이전에 벽을 부수지 않은 경우이면서 방문하지 않은 곳
					if (wall == 0 && !visited[nx][ny][0]) {
						// 벽인 경우 ( 0-1 상황)
						if (arr[nx][ny] == 1) {
							q.offer(new Node(nx, ny, distance + 1, wall + 1));
							visited[nx][ny][1] = true;
						}
						// 벽이 아닌 경우 ( 0-2 상황)
						else {
							q.offer(new Node(nx, ny, distance + 1, wall));
							visited[nx][ny][0] = true;
						}
					}
					// 이전에 벽을 부수고 방문하지 않은 곳
					else if (wall == 1 && !visited[nx][ny][1]) {
						// 벽이 아닌 경우만 체크( 1-2 상황)
						if (arr[nx][ny] == 0) {
							q.offer(new Node(nx, ny, distance + 1, wall));
							visited[nx][ny][1] = true;
						}
					}
				}
			}
		}

		if (ans == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();
		arr = new int[n][m];
		visited = new boolean[n][m][2];

		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < m; j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}

		// 시작점(0,0)부터 시작
		bfs(0, 0);

	}

}
