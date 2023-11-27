package DPSession5;

import java.util.Scanner;

public class FrogStoneProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long b[] = new long[n+1];
		for(int i = 0;i<n;i++) {
			b[i] = sc.nextLong();
		}
		long dp [] = new long[n+1];
		dp[1] = 0;
		dp[2] = Math.abs(b[1]-b[2]);
		int i = 3;
		while(i<=n) {
			long answer = Long.MAX_VALUE;
			int j = 1;
			while(j<=k && i-j>=1) {
				long yy = dp[i-j]+Math.abs(b[i]-b[i-j]);
				answer = Math.min(answer, yy);
				j++;
			}
			dp[i] = answer;
			i++;
		}
		
		
	}

}
