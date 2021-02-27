import java.util.*;

public class Q11729 {
	public static int n;
	public static StringBuilder sb = new StringBuilder();

	// n: 원판의 갯수, start : 출발지, mid : 보조고리, to : 도착지
	public static void hanoi(int n, int start, int mid, int to) {
		// 이동하는 원판의 수가 1개일때
		if (n == 1) {
			sb.append(start + " " + to + "\n");
			return;
		}

		// n-1개의 원판을 A -> B 이동
		hanoi(n - 1, start, to, mid);
		// 제일 큰 원판 1개를 A -> C로 이동
		sb.append(start + " " + to + "\n");
		// n-1개의 원판을 B -> C로 이동
		hanoi(n - 1, mid, start, to);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		// 이동 횟수
		int move = (int) (Math.pow(2, n) - 1);
		sb.append(move + "\n");

		hanoi(n, 1, 2, 3);
		System.out.println(sb);
	}

}
