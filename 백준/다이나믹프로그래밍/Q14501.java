import java.util.*;

public class Q14501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] t = new int[n];
		int[] p = new int[n];
		
		for(int i=0; i<n; i++) {
			t[i] = sc.nextInt();
			p[i] = sc.nextInt();
		}
		
		int[] dp = new int[16];
		int maxValue = 0;
		
		for(int i=n-1; i>=0; i--) {
			int time = t[i] + i;
			
			if(time <= n) {
				dp[i] = Math.max(p[i] + dp[time], maxValue);
				maxValue = dp[i];
			}else {
				dp[i] = maxValue;
			}
		}
		
		System.out.println(maxValue);

	}

}
