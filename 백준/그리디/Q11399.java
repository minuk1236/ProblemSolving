package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * 백준 ATM 문제 -11399번
 * */

public class Q11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			al.add(sc.nextInt());
		}
		
		Collections.sort(al);
		
		int result = 0;
		int prev = 0;
		
		for(int r : al) {
			r += prev;
			result += r;
			prev = r;
			
		}
		
		System.out.println(result);

	}

}
