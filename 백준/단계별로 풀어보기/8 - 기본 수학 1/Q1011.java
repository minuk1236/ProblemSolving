import java.util.*;

public class Q1011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			int dist = y - x;
			int max = (int) Math.sqrt(dist);

			if (max == Math.sqrt(dist)) {
				System.out.println(max * 2 - 1);
			} else if (dist <= max * max + max) {
				System.out.println(max * 2);
			} else {
				System.out.println(max * 2 + 1);
			}

		}
	}

}
