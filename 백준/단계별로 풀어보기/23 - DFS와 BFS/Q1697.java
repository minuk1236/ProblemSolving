import java.util.*;

public class Q1697 {
	public static int n, k;

	// 해당 인덱스까지 걸린 시간
	public static int[] visited = new int[100001];

	public static void bfs(int x) {
		Queue<Integer> q = new LinkedList<>();

		q.offer(x);
		visited[x] = 0;

		while (!q.isEmpty()) {
			int now = q.poll();

			// 위치가 같을 경우
			if (now == k) {
				break;
			}

			// 걷기(x-1, x+1), 순간이동 (2*x)
			if (now + 1 <= 100000 && visited[now + 1] == 0) {
				q.offer(now + 1);
				visited[now + 1] = visited[now] + 1;
			}

			if (now - 1 >= 0 && visited[now - 1] == 0) {
				q.offer(now - 1);
				visited[now - 1] = visited[now] + 1;
			}

			if (now * 2 <= 100000 && visited[now * 2] == 0) {
				q.offer(now * 2);
				visited[now * 2] = visited[now] + 1;
			}

		}

		System.out.println(visited[k]);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		k = sc.nextInt();

		bfs(n);

	}

}
