import java.util.*;

public class Q9655 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

//		if (n % 2 == 0) {
//			System.out.println("CY");
//		} else {
//			System.out.println("SK");
//		}

		boolean[] dp = new boolean[n + 1];
		Arrays.fill(dp, false);

		for (int i = 1; i <= n; i++) {
			if (!dp[i - 1]) {
				dp[i] = true;
			}

			if (i - 3 >= 0 && !dp[i - 3]) {
				dp[i] = true;
			}

		}

		if (dp[n]) {
			System.out.println("SK");
		} else {
			System.out.println("CY");
		}

	}

}
