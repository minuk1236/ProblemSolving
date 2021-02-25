import java.util.*;

class Node implements Comparable<Node> {
	private int index;
	private int distance;

	public Node(int index, int distance) {
		this.index = index;
		this.distance = distance;
	}

	public int getIndex() {
		return this.index;
	}

	public int getDistance() {
		return this.distance;
	}

	@Override
	public int compareTo(Node o) {
		if (this.distance < o.distance) {
			return -1;
		}
		return 1;
	}
}

public class Q1238 {
	public static final int INF = (int) 1e9;
	public static int n, m, x;

	public static ArrayList<ArrayList<Node>> graph = new ArrayList<>();
	public static ArrayList<ArrayList<Node>> reverseGraph = new ArrayList<>();
	public static int[] d1 = new int[1001];
	public static int[] d2 = new int[1001];

	public static int[] dijkstra(ArrayList<ArrayList<Node>> g) {
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		int[] result = new int[1001];
		Arrays.fill(result, INF);

		pq.offer(new Node(x, 0));
		result[x] = 0;

		while (!pq.isEmpty()) {
			Node node = pq.poll();
			int dist = node.getDistance();
			int now = node.getIndex();

			if (result[now] < dist)
				continue;

			for (int i = 0; i < g.get(now).size(); i++) {
				int cost = result[now] + g.get(now).get(i).getDistance();

				if (cost < result[g.get(now).get(i).getIndex()]) {
					result[g.get(now).get(i).getIndex()] = cost;
					pq.offer(new Node(g.get(now).get(i).getIndex(), cost));
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		x = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Node>());
			reverseGraph.add(new ArrayList<Node>());
		}

		for (int i = 0; i < m; i++) {
			// a: 시작점 b : 도착점 c : 시간(비용)
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			graph.get(a).add(new Node(b, c));
			reverseGraph.get(b).add(new Node(a, c));
		}

		d1 = dijkstra(graph);
		d2 = dijkstra(reverseGraph);

		int ans = 0;
		for (int i = 1; i <= n; i++) {
			ans = Math.max(ans, d1[i] + d2[i]);
		}

		System.out.println(ans);

	}

}
