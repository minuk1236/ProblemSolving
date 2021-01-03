package baekjoon;

/*
 * 백준 럭키스트레이트 문제 - 18406번
 * */

import java.util.*;

public class Q18406 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nStr = sc.nextLine();
		
		int sum1 = 0, sum2 = 0;
		
		int len = nStr.length();
		
		for(int i=0; i<len; i++) {
			if(i < len / 2) {
				sum1 += nStr.charAt(i)-'0';
			}else {
				sum2 += nStr.charAt(i) - '0';
			}
		}
		
		if(sum1 == sum2) {
			System.out.println("LUCKY");
		}else {
			System.out.println("READY");
		}

	}

}
