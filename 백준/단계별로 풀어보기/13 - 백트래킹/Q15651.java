import java.util.*;

public class Q15651 {
	public static int[] a = new int[10];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		System.out.println(backtracking(0, n, m));

	}

	public static StringBuilder backtracking(int index, int n, int m) {
		if (index == m) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < m; i++) {
				sb.append(a[i]);
				if (i != m - 1) {
					sb.append(" ");
				}
			}
			sb.append("\n");
			return sb;
		}

		StringBuilder ans = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			a[index] = i;
			ans.append(backtracking(index + 1, n, m));
		}

		return ans;
	}
}