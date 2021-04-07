import java.util.*;

public class Q2293 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] coins = new int[n];
		for (int i = 0; i < n; i++) {
			coins[i] = sc.nextInt();
		}

		int[] dp = new int[k + 1];
		dp[0] = 1;

		for (int i = 0; i < n; i++) {
			int coin = coins[i];
			for (int j = coin; j <= k; j++) {
				dp[j] += dp[j - coin];
			}
			// System.out.println(Arrays.toString(dp));
		}

		System.out.println(dp[k]);
	}

}
