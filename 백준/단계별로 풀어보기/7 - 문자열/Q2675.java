import java.util.*;

public class Q2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {
			int r = sc.nextInt();
			char[] ch = sc.next().toCharArray();

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < ch.length; i++) {
				// 반복 횟수
				for (int j = 0; j < r; j++) {
					sb.append(ch[i]);
				}
			}

			System.out.println(sb.toString());
		}

	}

}
