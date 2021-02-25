import java.util.*;

class Subject {
	private int index;
	private int semester;

	public Subject(int index, int semester) {
		this.index = index;
		this.semester = semester;
	}

	public int getIndex() {
		return this.index;
	}

	public int getSemester() {
		return this.semester;
	}
}

public class Q14567 {
	public static int n, m;
	public static int[] indegree = new int[500001];

	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	public static int result = 0;

	public static void topologySort() {
		// 결과 테이블
		int[] result = new int[n + 1];
		Queue<Subject> q = new LinkedList<>();

		for (int i = 1; i <= n; i++) {
			if (indegree[i] == 0) {
				q.offer(new Subject(i, 0));
			}
		}

		while (!q.isEmpty()) {
			Subject now = q.poll();

			for (int i = 0; i < graph.get(now.getIndex()).size(); i++) {
				indegree[graph.get(now.getIndex()).get(i)] -= 1;
				if (indegree[graph.get(now.getIndex()).get(i)] == 0) {
					result[graph.get(now.getIndex()).get(i)] = now.getSemester() + 1;
					q.offer(new Subject(graph.get(now.getIndex()).get(i), now.getSemester() + 1));
				}
			}
		}

		for (int i = 1; i < result.length; i++) {
			System.out.print((result[i] + 1) + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
			indegree[b] += 1;
		}

		topologySort();
	}

}
