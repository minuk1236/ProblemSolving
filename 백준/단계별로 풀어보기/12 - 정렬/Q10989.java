import java.io.*;

public class Q10989 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int[] cnt = new int[10001];
		for (int i = 0; i < n; i++) {
			cnt[arr[i]] += 1;
		}

		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] != 0) {
				for (int j = 0; j < cnt[i]; j++) {
					sb.append(i + "\n");
				}
			}
		}

		System.out.println(sb.toString());
		br.close();

	}

}
