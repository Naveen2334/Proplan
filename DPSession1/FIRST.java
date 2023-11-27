package DPSession1;

public class FIRST {
	public static void main(String[] args) {
		int n = 5;
		int[] a = {6,7,3,2,2};
		int dp[] = new int[n+1];
		int i = 0;
		while(i<=n-1) {
			if(i==0) {
				dp[i] = a[i];
				
			}
			else {
				dp[i]=a[i]+dp[i-1];
			}
			i++;
		}
		int q= 4;
		int w[] = {0,3,4,2};
		i=0;
		while(i<=q-1) {
			int query = w[i];
			System.out.println(dp[query]);
			i++;
		}
	}

}
