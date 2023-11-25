package HashMapSession1;

import java.util.Scanner;

public class PrefixSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value n");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int prefixSum[] = new int[n];
		int sum = 0;
		for(int i= 0;i<n;i++) {
			arr[i] = sc.nextInt();
			sum = sum+arr[i];
			prefixSum[i] = sum;
		}
		int q = sc.nextInt();
		while(q>0) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int right = prefixSum[r-1];
			int left = 1 ==1?0:prefixSum[l-2];
			System.out.println(right-left);
			q--;
		}

		
	}
	

}
