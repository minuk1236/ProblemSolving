import java.io.*;
import java.util.*;

public class Q11004 {
	public static int binarySearch(ArrayList<Integer> arr, int target, int start, int end) {
		if (start > end) {
			return -1;
		}

		int mid = (start + end) / 2;
		if (target == mid) {
			return mid;
		} else if (target < mid) {
			return binarySearch(arr, target, start, mid - 1);
		} else {
			return binarySearch(arr, target, mid + 1, end);
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		ArrayList<Integer> arr = new ArrayList<Integer>();
		st = new StringTokenizer(br.readLine(), " ");
		while (st.hasMoreTokens()) {
			arr.add(Integer.parseInt(st.nextToken()));
		}

		Collections.sort(arr);

		System.out.println(arr.get(binarySearch(arr, k - 1, 0, n - 1)));

		br.close();
	}

}
