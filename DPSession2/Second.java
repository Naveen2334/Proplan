package DPSession2;

import java.util.Scanner;

public class Second {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("size of array");
		int n = sc.nextInt();
		int a[] = new int[n+1];
		int i = 1;
		while(i<=n) {
			a[i]=sc.nextInt();
			i++;
		}
		int dp[] = new int[n+1];
		int l = 0;
		dp[1] = Math.max(a[1], l);
		dp[2] = Math.max(a[1], Math.max(a[2], l));
		i=3;
		while(i<=n) {
			dp[i] = Math.max(dp[i-1],a[i]+dp[i-2]);
			i++;
		}
		System.out.println(dp[n]);
	}

}
