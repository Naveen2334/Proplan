package DPSession3;

import java.util.Scanner;

public class Third {
	public static void main(String[] args) {
		System.out.println("enter the value of n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n + 1];
		int b[] = new int[n + 1];
		int dp[] = new int[n + 1];
		System.out.println("enter the first array");
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("enter the second array");
		for (int i = 1; i <= n; i++) {
			b[i] = sc.nextInt();
		}
		dp[1] = Math.max(a[1], b[1]);
		dp[2] = Math.max(dp[1], Math.max(a[2], b[2]));

		for (int i = 0; i <= n; i++) {
			int x = dp[i-1];
			int y = b[i]+dp[i-2];
			int z = a[i]+dp[i-2];
			dp[i] = Math.max(y, z);

		}
		System.out.println("your answert"+dp[n]);

	}
}
