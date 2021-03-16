import java.util.*;

public class Q1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		int result = 0;

		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();

			// a ~ z
			boolean[] check = new boolean[26];

			boolean ans = true;
			char prev = '0';
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);

				if (prev == c) {
					continue;
				} else {
					if (!check[c - 'a']) {
						check[c - 'a'] = true;
						prev = c;
					} else {
						ans = false;
						break;
					}
				}
			}

			if (ans) {
				result += 1;
			}
		}

		System.out.println(result);

	}

}
