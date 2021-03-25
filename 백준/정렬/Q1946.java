import java.io.*;
import java.util.*;

public class Q1946 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			// 서류 순위에 따른 면접 순위 저장 배열
			int[] arr = new int[n + 1];

			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				arr[a] = b;
			}

			// 1등은 무조건 입사
			int count = 1;
			// 1등의 면접 순위
			int rank = arr[1];

			for (int i = 2; i <= n; i++) {
				// 현재 면접 순위가 이전 면접순위보다 작다면 (더 높은 순위라면)
				if (arr[i] < rank) {
					count += 1;
					rank = arr[i];
				}
			}

			System.out.println(count);

		}
		br.close();

	}

}
