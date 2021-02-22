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

public class Q1753 {
	public static final int INF = (int) 1e9;

	// 정점 v 간선 e 시작점 start
	public static int v, e, start;

	public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();

	public static int[] d = new int[20001];

	public static void dijkstra(int start) {
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		pq.offer(new Node(start, 0));
		d[start] = 0;

		while (!pq.isEmpty()) {
			Node node = pq.poll();
			int dist = node.getDistance();
			int now = node.getIndex();

			if (d[now] < dist) {
				continue;
			}

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

		v = sc.nextInt();
		e = sc.nextInt();
		start = sc.nextInt();

		for (int i = 0; i <= v; i++) {
			graph.add(new ArrayList<Node>());
		}

		for (int i = 0; i < e; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int w = sc.nextInt();

			graph.get(u).add(new Node(v, w));
		}

		Arrays.fill(d, INF);

		dijkstra(start);

		for (int i = 1; i <= v; i++) {
			if (d[i] == INF) {
				System.out.println("INF");
			} else {
				System.out.println(d[i]);
			}
		}
	}

}