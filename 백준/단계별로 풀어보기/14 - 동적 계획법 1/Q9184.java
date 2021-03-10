import java.io.*;

public class Q9184 {
	public static int a, b, c;
	public static int[][][] d = new int[21][21][21];

	public static int w(int a, int b, int c) {

		if (a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}

		if (a > 20 || b > 20 || c > 20) {
			return w(20, 20, 20);
		}

		if (d[a][b][c] != 0) {
			return d[a][b][c];
		}

		if (a < b && b < c) {
			return d[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
		}

		return d[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String[] str = br.readLine().split(" ");
			a = Integer.parseInt(str[0]);
			b = Integer.parseInt(str[1]);
			c = Integer.parseInt(str[2]);

			if (a == -1 && b == -1 && c == -1) {
				break;
			}

			w(a, b, c);
			System.out.println("w(" + a + ", " + b + ", " + c + ") = " + w(a, b, c));

		}
		br.close();

	}

}
