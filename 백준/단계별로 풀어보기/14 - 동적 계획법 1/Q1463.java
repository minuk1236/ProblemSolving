import java.util.*;

public class Q1463 {
	public static int n;
	public static int[] d;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		d = new int[n + 1];

		for (int i = 2; i <= n; i++) {
			// 현재 수에서 1을 빼는 경우
			d[i] = d[i - 1] + 1;

			// 현재 수가 2로 나누어 떨어지는 경우
			if (i % 2 == 0) {
				d[i] = Math.min(d[i], d[i / 2] + 1);
			}
			// 현재 수가 3으로 나누어 떨어지는 경우
			if (i % 3 == 0) {
				d[i] = Math.min(d[i], d[i / 3] + 1);
			}
		}

		System.out.println(d[n]);

	}

}
