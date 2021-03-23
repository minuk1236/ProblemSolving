import java.util.*;

public class Q7568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// person[][0] : 무게
		// person[][1] : 키
		int[][] person = new int[n][2];

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			person[i][0] = x;
			person[i][1] = y;

		}

		for (int i = 0; i < n; i++) {
			int rank = 1;

			for (int j = 0; j < n; j++) {
				if (i == j) {
					continue;
				}

				if (person[i][0] < person[j][0] && person[i][1] < person[j][1]) {
					rank += 1;
				}
			}

			System.out.print(rank + " ");
		}

	}

}
