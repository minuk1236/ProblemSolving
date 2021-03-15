import java.util.*;

public class Q8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < t; i++) {
			char[] ch = sc.nextLine().toCharArray();

			int ans = 0;
			int count = 0;
			for (int j = 0; j < ch.length; j++) {
				char c = ch[j];
				if (c == 'O') {
					count += 1;
				} else if (c == 'X') {
					count = 0;
				}

				ans += count;
			}
			System.out.println(ans);
		}

	}

}
