import java.util.*;

public class Q1260 {
	public static int n, m;
	public static boolean[] visited = new boolean[1001];

	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

	public static void dfs(int x) {
		visited[x] = true;
		System.out.print(x + " ");

		for (int i = 0; i < graph.get(x).size(); i++) {
			int y = graph.get(x).get(i);
			if (!visited[y]) {
				dfs(y);
			}
		}

	}

	public static void bfs(int x) {
		Queue<Integer> q = new LinkedList<Integer>();

		q.offer(x);
		visited[x] = true;

		while (!q.isEmpty()) {
			int now = q.poll();
			System.out.print(now + " ");

			for (int i = 0; i < graph.get(now).size(); i++) {
				int y = graph.get(now).get(i);
				if (!visited[y]) {
					q.offer(y);
					visited[y] = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		int start = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			graph.get(a).add(b);
			graph.get(b).add(a);
		}

		for (int i = 0; i <= n; i++) {
			Collections.sort(graph.get(i));
		}

		dfs(start);
		System.out.println();
		Arrays.fill(visited, false);
		bfs(start);

	}

}
