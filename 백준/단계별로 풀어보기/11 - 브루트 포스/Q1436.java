import java.util.*;

public class Q1436 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int num = 666;
		int count = 1;

		while (count != n) {
			num += 1;
			if (String.valueOf(num).contains("666")) {
				count += 1;
			}
		}

		System.out.println(num);

	}

}
