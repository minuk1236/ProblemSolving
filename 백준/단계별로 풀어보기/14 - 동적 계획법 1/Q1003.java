import java.io.*;

public class Q1003 {
	public static int n;
	public static int[][] d = new int[41][2];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		// d[N][0] : 0 호출 횟수 , d[N][1] : 1 호출 횟수
		d[0][0] = 1;
		d[1][1] = 1;

		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());

			for (int i = 2; i <= n; i++) {
				// 0 과 1
				for (int j = 0; j < 2; j++) {
					d[i][j] = d[i - 1][j] + d[i - 2][j];
				}
			}

			System.out.println(d[n][0] + " " + d[n][1]);
		}
	}

}
