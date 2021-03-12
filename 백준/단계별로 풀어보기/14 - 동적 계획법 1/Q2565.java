import java.util.*;

public class Q2565 {
	public static int n;
	public static int[] arr = new int[501];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a] = b;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				al.add(arr[i]);
		}

		int[] d = new int[al.size()];
		Arrays.fill(d, 1);

		for (int i = 1; i < al.size(); i++) {
			for (int j = 0; j < i; j++) {
				if (al.get(j) < al.get(i)) {
					d[i] = Math.max(d[i], d[j] + 1);
				}
			}
		}
		int max = 0;
		for (int i = 0; i < d.length; i++) {
			max = Math.max(max, d[i]);
		}

		System.out.println(n - max);
	}

}
