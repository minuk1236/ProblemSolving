import java.util.*;

public class Q2579 {
	public static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int[] arr = new int[n + 1];
		int[] d = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}

		d[1] = arr[1];
		if (n >= 2)
			d[2] = arr[1] + arr[2];

		for (int i = 3; i <= n; i++) {
			// 두 계단 뛰어서 올라오는 경우, 바로 아래 계단에서 올라오는 경우
			d[i] = Math.max(d[i - 2] + arr[i], d[i - 3] + arr[i - 1] + arr[i]);
		}

		System.out.println(d[n]);
	}

}
