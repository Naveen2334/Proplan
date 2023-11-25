package HashMapSession2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxDistance {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Map<Integer,Integer> map = new HashMap<>();
		int ans = 0;
		for(int i = 0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				ans=Math.max(ans, i-map.get(arr[i]));
			}
			else {
				map.put(arr[i], i);
			}
		}
	System.out.println(ans);
	}

}
