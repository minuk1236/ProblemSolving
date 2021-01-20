package baekjoon;

import java.util.*;

public class Q1715 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for (int i = 0; i < n; i++) {
			pq.offer(sc.nextInt());
		}
		int result = 0;

		while (pq.size() != 1) {
			int a = pq.poll();
			int b = pq.poll();

			int sum = a + b;

			result += sum;
			pq.offer(sum);
		}

		System.out.println(result);

	}

}
