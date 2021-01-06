package baekjoon;

import java.util.*;

public class Q10773 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		Stack<Integer> s = new Stack<>();
		
		while(k-- > 0) {
			int temp = sc.nextInt();
			
			if(temp == 0) {
				s.pop();
			}else
				s.push(temp);
		}
		
		int sum = 0;
		while(!s.isEmpty()) {
			sum += s.pop();
		}
		
		System.out.println(sum);
	}

}
