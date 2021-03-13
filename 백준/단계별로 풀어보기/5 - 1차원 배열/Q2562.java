import java.util.*;

public class Q2562 {
	public static int max = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[9];

		int index = 0;

		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}

		System.out.println(max);
		System.out.println(index + 1);

	}

}
