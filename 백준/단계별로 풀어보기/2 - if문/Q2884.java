import java.util.*;

public class Q2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();

		if (m < 45) {
			m = (m + 60) - 45;
			h -= 1;
			if (h < 0) {
				h = 23;
			}
		} else {
			m -= 45;
		}

		System.out.println(h + " " + m);
	}

}
