package baekjoon;

import java.util.*;

/*
 * 백준 동전0 문제 - 11047번
 * */

public class Q11047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			al.add(sc.nextInt());
		}

		Collections.sort(al, Comparator.reverseOrder());

		int count = 0;

		for (int a : al) {
			while (k >= a) {
				k -= a;
				count++;
			}
		}

		System.out.println(count);
	}

}
