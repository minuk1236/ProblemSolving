import java.util.*;

public class Q11652 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		long[] cards = new long[n];

		for (int i = 0; i < n; i++) {
			cards[i] = sc.nextLong();
		}

		Arrays.sort(cards);

		// 초기 값
		long ans = cards[0];

		int count = 1;
		// 가장 많이 가지고 있는 갯수
		int max = 1;

		for (int i = 1; i < n; i++) {
			if (cards[i] == cards[i - 1]) {
				count += 1;
			} else {
				count = 1;
			}

			if (count > max) {
				max = count;
				ans = cards[i];
			}
		}

		System.out.println(ans);
	}

}
