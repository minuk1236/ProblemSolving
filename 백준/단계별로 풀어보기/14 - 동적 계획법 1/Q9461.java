import java.util.*;

public class Q9461 {
	public static int t, n;
	public static long[] d = new long[101];

	public static long p(int x) {
		if (x == 0) {
			return 0;
		}

		if (x == 1 || x == 2 || x == 3) {
			return 1;
		}

		if (d[x] != 0) {
			return d[x];
		}

		return d[x] = p(x - 2) + p(x - 3);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		t = sc.nextInt();

		while (t-- > 0) {
			n = sc.nextInt();

			System.out.println(p(n));
		}
	}

}
