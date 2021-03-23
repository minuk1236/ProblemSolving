import java.util.*;

public class Q1002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();

			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();

			System.out.println(count(x1, y1, r1, x2, y2, r2));
		}

	}

	public static int count(int x1, int y1, int r1, int x2, int y2, int r2) {
		// 두 원의 중심간의 거리
		int dist = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		// 두 원의 중심이 같고 반지름이 같은 경우 (접점의 개수가 무한)
		if (x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		}
		// 두 점 사이의 거리가 각 원의 반지름의 합보다 클 때 (접점이 없음)
		else if (dist > Math.pow(r1 + r2, 2)) {
			return 0;
		}
		// 한 원 안에 다른 원이 있으면서 접점이 없는 경우
		else if (dist < Math.pow(r2 - r1, 2)) {
			return 0;
		}
		// 한 원 안에 다른 원이 있으면서 내접하는 경우 (접점 하나)
		else if (dist == Math.pow(r2 - r1, 2)) {
			return 1;
		}
		// 두 원이 외접하는 경우 (접점 하나)
		else if (dist == Math.pow(r1 + r2, 2)) {
			return 1;
		} else {
			return 2;
		}

	}

}
