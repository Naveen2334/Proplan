package DPSession4;

import java.util.Scanner;

public class FrogHeightStone {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("enter the value n");
		int n = sc.nextInt();
		long b[] = new long[n+1];
		long dp[] = new long[n+1];
		
		System.out.println("enter the array1::");
		for(int i = 0;i<n;i++) {
			b[i] = sc.nextLong();
		}
		dp[1] = 0;
		dp[2] = Math.abs(b[1]-b[2]);
		for(int i=3;i<=n;i++) {
		dp[i] = Math.min(dp[i-1]+ Math.abs(b[i]-b[i-1]), dp[i-2]+Math.abs(b[i]-b[i-2]));
		}
		System.out.println(dp[n]);
		
	}

}
