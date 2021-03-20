import java.util.*;

public class Q2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int count = 0;

		while (true) {
			if (n % 5 == 0) {
				count += (n / 5);
				break;
			}

			n -= 3;
			if (n < 0) {
				count = -1;
				break;
			}
			count += 1;
		}

		System.out.println(count);

	}

}
