import java.util.*;

public class Q2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int num = a * b * c;

		int[] ans = new int[10];

		String numS = String.valueOf(num);
		for (int i = 0; i < numS.length(); i++) {
			ans[numS.charAt(i) - '0'] += 1;
		}

		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}

}
