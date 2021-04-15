import java.util.*;

public class Q14888 {
	public static int n;
	public static int max = Integer.MIN_VALUE;
	public static int min = Integer.MAX_VALUE;

	public static ArrayList<Integer> arr = new ArrayList<>();
	public static int[] oper = new int[4];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}

		for (int i = 0; i < 4; i++) {
			oper[i] = sc.nextInt();
		}

		backtracking(1, arr.get(0));

		System.out.println(max);
		System.out.println(min);
	}

	public static void backtracking(int idx, int num) {
		if (idx == n) {
			min = Math.min(min, num);
			max = Math.max(max, num);
			return;
		}

		for (int i = 0; i < 4; i++) {
			if (oper[i] > 0) {
				oper[i]--;

				if (i == 0) {
					backtracking(idx + 1, num + arr.get(idx));
				} else if (i == 1) {
					backtracking(idx + 1, num - arr.get(idx));
				} else if (i == 2) {
					backtracking(idx + 1, num * arr.get(idx));
				} else if (i == 3) {
					backtracking(idx + 1, num / arr.get(idx));
				}
				oper[i]++;
			}
		}

	}

}
