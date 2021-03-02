import java.util.*;

public class Q2606 {
	public static int v, e, result = 0;
	public static boolean[] visited = new boolean[101];
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

	public static void dfs(int x) {
		visited[x] = true;

		for (int i = 0; i < graph.get(x).size(); i++) {
			int y = graph.get(x).get(i);
			if (!visited[y]) {
				result += 1;
				dfs(y);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		v = sc.nextInt();
		e = sc.nextInt();

		for (int i = 0; i <= v; i++) {
			graph.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < e; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			graph.get(a).add(b);
			graph.get(b).add(a);
		}

		dfs(1);
		System.out.println(result);
	}

}
