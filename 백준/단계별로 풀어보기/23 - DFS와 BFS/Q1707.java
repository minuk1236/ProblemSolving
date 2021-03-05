import java.util.*;

public class Q1707 {
	public static int t, v, e;
	public static int[] color;

	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

	// x : 정점 , c : 컬러 (1 or 2)
	public static void dfs(int x, int c) {
		color[x] = c;

		for (int i = 0; i < graph.get(x).size(); i++) {
			int y = graph.get(x).get(i);
			if (color[y] == 0) {
				dfs(y, 3 - c);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		t = sc.nextInt();

		while (t-- > 0) {
			v = sc.nextInt();
			e = sc.nextInt();

			color = new int[v + 1];

			for (int i = 0; i <= v; i++) {
				graph.add(new ArrayList<Integer>());
			}

			for (int i = 0; i < e; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();

				graph.get(a).add(b);
				graph.get(b).add(a);
			}

			boolean ans = true;
			for (int i = 1; i <= v; i++) {
				if (color[i] == 0) {
					dfs(i, 1);
				}
			}

			for (int i = 1; i <= v; i++) {
				for (int j = 0; j < graph.get(i).size(); j++) {
					int x = graph.get(i).get(j);
					if (color[i] == color[x]) {
						ans = false;
					}
				}
			}

			if (ans) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

			graph.clear();
		}
	}

}
