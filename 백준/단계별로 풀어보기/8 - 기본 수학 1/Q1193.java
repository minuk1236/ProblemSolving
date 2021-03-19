import java.util.*;

public class Q1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		if (x == 1) {
			System.out.println(1 + "/" + 1);
		} else {
			int line = 1;
			int count = 1;

			while (count < x) {
				line += 1;
				count = (line * (line + 1)) / 2;
			}

			int up = 0, down = 0;

			// 짝수 줄일 때
			if (line % 2 == 0) {
				up = line - (count - x);
				down = count - x + 1;
				System.out.println(up + "/" + down);
			}
			// 홀수 줄일 때
			else {
				up = count - x + 1;
				down = line - (count - x);
				System.out.println(up + "/" + down);
			}

		}

	}

}
