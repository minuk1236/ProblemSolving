import java.util.*;

public class Q9663 {
	public static int[] arr;
	public static int n;
	public static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		arr = new int[n];

		nQueen(0);
		System.out.println(count);

	}

	public static void nQueen(int depth) {
		if (depth == n) {
			count += 1;
			return;
		}

		for (int i = 0; i < n; i++) {
			arr[depth] = i;

			if (possible(depth)) {
				nQueen(depth + 1);
			}
		}
	}

	public static boolean possible(int col) {
		for (int i = 0; i < col; i++) {
			if (arr[col] == arr[i]) {

				return false;
			} else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
				return false;
			}
		}

		return true;
	}
}
