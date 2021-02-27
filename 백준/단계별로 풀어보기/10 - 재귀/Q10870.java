import java.util.*;

public class Q10870 {
	public static int n;
	public static int[] d = new int[21];

	public static int fib(int x) {
		if (x == 0 || x == 1) {
			return x;
		}

		if (d[x] != 0) {
			return d[x];
		}

		d[x] = fib(x - 1) + fib(x - 2);

		return d[x];

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		System.out.println(fib(n));

	}

}
