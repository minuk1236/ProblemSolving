import java.util.*;

public class Q5622 {
	public static int[] times = { 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] ch = sc.nextLine().toCharArray();

		int ans = 0;
		for (int i = 0; i < ch.length; i++) {
			ans += times[ch[i] - 'A'];
		}
		System.out.println(ans);

	}

}
