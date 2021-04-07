import java.util.*;

public class Q9507 {
	public static long[] d = new long[68];

	public static long koong(int n) {
		if (n < 2) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}

		if (n == 3) {
			return 4;
		}

		if (d[n] != 0) {
			return d[n];
		}

		return d[n] = koong(n - 1) + koong(n - 2) + koong(n - 3) + koong(n - 4);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		d[0] = 1;
		d[1] = 1;
		d[2] = 2;
		d[3] = 4;

		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(koong(n));
		}

	}

}
