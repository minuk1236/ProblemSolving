import java.util.*;

public class Q1904 {
	public static int n;

	public static int[] d = new int[1000001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		d[1] = 1;
		d[2] = 2;

		for (int i = 3; i <= n; i++) {
			d[i] = (d[i - 2] + d[i - 1]) % 15746;
		}

		System.out.println(d[n]);
	}

}
