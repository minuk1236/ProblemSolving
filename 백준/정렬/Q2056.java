import java.util.*;

public class Q2056 {
	public static int n;
	public static int[] indegree = new int[10001];

	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	public static int[] times = new int[10001];

	public static void topologySort() {
		int[] result = new int[10001];

		for (int i = 1; i <= n; i++) {
			result[i] = times[i];
		}

		Queue<Integer> q = new LinkedList<Integer>();

		for (int i = 1; i <= n; i++) {
			if (indegree[i] == 0) {
				q.offer(i);
			}
		}

		while (!q.isEmpty()) {
			int now = q.poll();
			for (int i = 0; i < graph.get(now).size(); i++) {

				// 인접한 노드에 대하여 더 오랜 시간이 걸리는 경위의 시간 값을 저장
				result[graph.get(now).get(i)] = Math.max(result[graph.get(now).get(i)],
						result[now] + times[graph.get(now).get(i)]);
				indegree[graph.get(now).get(i)] -= 1;

				if (indegree[graph.get(now).get(i)] == 0) {
					q.offer(graph.get(now).get(i));
				}
			}
		}

		// 결과 출력
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			ans = Math.max(ans, result[i]);
		}

		System.out.println(ans);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		// graph 초기화
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}

		// 1~N 번 작업
		for (int i = 1; i <= n; i++) {
			int time = sc.nextInt();
			times[i] = time;
			// x : 작업의 개수
			int x = sc.nextInt();
			for (int j = 0; j < x; j++) {
				// job : 선행 관계 있는 작업
				int job = sc.nextInt();
				indegree[i] += 1;
				graph.get(job).add(i);
			}
		}

		topologySort();
	}

}
