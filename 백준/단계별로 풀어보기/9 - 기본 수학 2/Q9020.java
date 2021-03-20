import java.util.*;

public class Q9020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean[] arr = new boolean[10001];
		Arrays.fill(arr, true);
		arr[1] = false;

		for (int i = 2; i <= Math.sqrt(arr.length); i++) {
			if (arr[i] == true) {
				int j = 2;
				while (i * j < arr.length) {
					arr[i * j] = false;
					j += 1;
				}
			}
		}

		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int p = n / 2;
			int q = n / 2;

			while (true) {
				if (arr[p] && arr[q]) {
					System.out.println(p + " " + q);
					break;
				}

				p -= 1;
				q += 1;
			}
		}

	}

}
