import java.util.*;

public class Q10844 {
	public static final long mod = 1000000000L;
	public static int n;
	public static long[][] d;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		d = new long[n + 1][10]; // 길이가 N, 0~9까지 수

		// 길이가 1일때
		for (int i = 1; i <= 9; i++) {
			d[1][i] = 1;
		}

		// 2자리 부터 N자리 수 까지
		for (int i = 2; i <= n; i++) {
			// 0~9까지 탐색
			for (int j = 0; j <= 9; j++) {
				if (j == 0) {
					d[i][j] = d[i - 1][j + 1] % mod;
				} else if (j == 9) {
					d[i][j] = d[i - 1][j - 1] % mod;
				} else {
					d[i][j] = (d[i - 1][j + 1] + d[i - 1][j - 1]) % mod;
				}
			}
		}

		long result = 0;
		for (int i = 0; i <= 9; i++) {
			result += d[n][i];
		}
		result %= 1000000000L;
		System.out.println(result);
	}

}
