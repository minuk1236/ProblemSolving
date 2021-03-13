import java.util.*;

public class Q1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int newN = n;
		int temp, sum, count = 0;

		while (true) {
			temp = newN % 10;
			sum = (newN / 10) + (newN % 10);
			newN = (temp * 10) + (sum % 10);

			count += 1;

			if (newN == n) {
				break;
			}
		}

		System.out.println(count);
	}

}
