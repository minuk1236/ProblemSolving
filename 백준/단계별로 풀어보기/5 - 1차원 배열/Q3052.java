import java.util.*;

public class Q3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}

		int[] modArr = new int[43]; // 0~42
		for (int i = 0; i < arr.length; i++) {
			modArr[arr[i] % 42] += 1;
		}

		int count = 0;
		for (int i = 0; i < modArr.length; i++) {
			if (modArr[i] != 0) {
				count += 1;
			}
		}
		System.out.println(count);

	}

}
