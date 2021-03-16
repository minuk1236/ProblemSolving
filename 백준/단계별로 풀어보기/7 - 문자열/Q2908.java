import java.util.*;

public class Q2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String num1 = sc.next();
		String num2 = sc.next();

		String newNum1 = "", newNum2 = "";

		for (int i = num1.length() - 1; i >= 0; i--) {
			newNum1 += num1.charAt(i);
		}

		for (int i = num2.length() - 1; i >= 0; i--) {
			newNum2 += num2.charAt(i);
		}

		int ans = Math.max(Integer.parseInt(newNum1), Integer.parseInt(newNum2));
		System.out.println(ans);
	}

}
