import java.util.*;

public class Q1676 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int count = 0;

		while (n >= 5) {
			count += (n / 5);
			n /= 5;
		}

		System.out.println(count);
	}

}
