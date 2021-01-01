package baekjoon;

/*
 * 백준 스네이크버드 문제 - 16435번
 * */


import java.util.*;

public class Q16435 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int l = sc.nextInt();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			al.add(sc.nextInt());
		}
		
		Collections.sort(al);
				
		for(int a : al) {
			if(a > l) {
				break;
			}
			l++;
			
		}

		System.out.println(l);
	}

}
