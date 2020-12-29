package baekjoon;

import java.util.*;

/*
 * 백준 로프 문제 - 2217번
 * */

public class Q2217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			al.add(sc.nextInt());
		}
		
		// 내림차순
		Collections.sort(al, Comparator.reverseOrder());
		
		int result = 0;  // 최대 중량
		
		for(int i = 0; i< n; i++) {
			int w = al.get(i) * (i+1);
			if(result < w) {
				result = w;
			}
		}
		System.out.println(result);
			
	}
}
