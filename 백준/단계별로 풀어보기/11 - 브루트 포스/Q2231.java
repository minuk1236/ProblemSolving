import java.util.*;

public class Q2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int ans = 0;

		for (int i = 1; i < n; i++) {
			int num = i;
			// 각 자리수의 합 -> 분해합
			int sum = 0;

			while (num != 0) {
				sum += (num % 10);
				num /= 10;
			}

			if (sum + i == n) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);

	}

}
