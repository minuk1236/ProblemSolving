import java.util.*;

public class Q15650 {
	public static boolean[] visited = new boolean[10];
	public static int[] a = new int[10];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		backtracking(0, 1, n, m);

	}

	public static void backtracking(int index, int start, int n, int m) {
		if (index == m) {
			for (int i = 0; i < m; i++) {
				System.out.print(a[i]);
				if (i != m - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
			return;
		}

		for (int i = start; i <= n; i++) {
			if (visited[i])
				continue;

			visited[i] = true;
			a[index] = i;
			backtracking(index + 1, i + 1, n, m);
			visited[i] = false;
		}
	}
}