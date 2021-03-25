import java.util.*;

public class Q10815 {
	public static int binarySearch(ArrayList<Integer> arr, int target, int start, int end) {
		if (start > end) {
			return -1;
		}

		int mid = (start + end) / 2;

		if (target == arr.get(mid)) {
			return mid;
		} else if (target < arr.get(mid)) {
			return binarySearch(arr, target, start, mid - 1);
		} else {
			return binarySearch(arr, target, mid + 1, end);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}

		Collections.sort(arr);

		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int num = sc.nextInt();

			int ans = binarySearch(arr, num, 0, n - 1);
			if (ans != -1) {
				System.out.print(1 + " ");
			} else {
				System.out.print(0 + " ");
			}
		}

	}

}
