import java.util.*;

public class Q2108 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		int sum = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		Arrays.sort(arr);

		// 빈도 수를 구하기 위함
		int[] cnt = new int[8001];
		for (int i = 0; i < arr.length; i++) {
			cnt[arr[i] + 4000] += 1;
		}

		int maxFreq = 0;
		for (int i = 0; i < cnt.length; i++) {
			maxFreq = Math.max(cnt[i], maxFreq);
		}

		// 최빈값
		int mode = arr[0];
		// 두번째 수인지 판별하는 변수
		boolean check = false;

		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] == maxFreq) {
				if (check) {
					mode = i - 4000;
					break;
				}
				mode = i - 4000;
				check = true;
			}
		}

		int avg = (int) Math.round((double) sum / n);
		int mid = arr[(n - 1) / 2];
		int range = arr[n - 1] - arr[0];

		System.out.println(avg);
		System.out.println(mid);
		System.out.println(mode);
		System.out.println(range);

	}

}
