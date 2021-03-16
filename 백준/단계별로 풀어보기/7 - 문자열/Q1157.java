import java.util.*;

public class Q1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		str = str.toUpperCase();

		int[] count = new int[26];
		int max = 0, index = -1;
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i) - 'A'] += 1;
		}

		boolean check = false;
		for (int i = 0; i < count.length; i++) {
			int cnt = count[i];
			if (max == cnt) {
				check = true;
			} else if (max < cnt) {
				max = cnt;
				index = i;
				check = false;
			}
		}

		if (check) {
			System.out.println("?");
		} else {
			int ans = 'A' + index;
			System.out.println((char) ans);
		}

	}

}
