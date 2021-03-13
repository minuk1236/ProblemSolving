import java.util.*;

public class Q9251 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] str1 = sc.nextLine().toCharArray();
		char[] str2 = sc.nextLine().toCharArray();

		int[][] dp = new int[str1.length + 1][str2.length + 1];

		for (int i = 1; i <= str1.length; i++) {
			for (int j = 1; j <= str2.length; j++) {

				// 같을 경우
				if (str1[i - 1] == str2[j - 1]) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				}
				// 같지 않을 경우
				else {
					dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
				}
			}
		}

		System.out.println(dp[str1.length][str2.length]);

	}

}
