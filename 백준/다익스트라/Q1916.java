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

public class Q1916 {
	public static final int INF = (int) 1e9;
	// 도시의 개수(n), 버스의 개수(m), 시작점(start), 도착점(end)
	public static int n, m, start, end;

	public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
	public static int[] d = new int[1001];

	public static void dijkstra(int start) {
		PriorityQueue<Node> pq = new PriorityQueue<Node>();

		pq.offer(new Node(start, 0));
		d[start] = 0;

		while (!pq.isEmpty()) {
			Node node = pq.poll();
			int dist = node.getDistance();
			int now = node.getIndex();

			if (d[now] < dist)
				continue;

			for (int i = 0; i < graph.get(now).size(); i++) {
				int cost = d[now] + graph.get(now).get(i).getDistance();

				if (cost < d[graph.get(now).get(i).getIndex()]) {
					d[graph.get(now).get(i).getIndex()] = cost;
					pq.offer(new Node(graph.get(now).get(i).getIndex(), cost));
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Node>());
		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int cost = sc.nextInt();

			graph.get(a).add(new Node(b, cost));
		}

		Arrays.fill(d, INF);

		start = sc.nextInt();
		end = sc.nextInt();

		dijkstra(start);

		System.out.println(d[end]);
	}

}
