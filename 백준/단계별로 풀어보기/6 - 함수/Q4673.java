import java.util.*;

public class Q4673 {
	public static int d(int n) {
		int selfNum = n;

		while (n != 0) {
			selfNum += (n % 10);
			n /= 10;
		}

		return selfNum;
	}

	public static void main(String[] args) {
		boolean[] arr = new boolean[10001];

		for (int i = 1; i < arr.length; i++) {
			int n = d(i);

			if (n <= 10000) {
				arr[n] = true;
			}
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == false) {
				System.out.println(i);
			}
		}
	}

}
