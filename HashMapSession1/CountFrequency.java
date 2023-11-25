package HashMapSession1;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
	
	static Map<Integer,Integer> map = new HashMap<>();
	static  void countFreq(int a[],int n) {
		for(int i = 0;i<n;i++) {
			if(map.containsKey(a[i])){
				map.put(a[i], map.get(a[i]+1));
			}
			else {
				map.put(a[i],1);
			}
		}
	}
	static int query(int x) {
		if(map.containsKey(x)) {
			return map.get(x);
		}
		
		return 0;
		
	}
	public static void main(String[] args) {
		int a[] = {1, 3, 2, 4, 2, 1};
		int n = a.length;
		countFreq(a, n);
		System.out.println(query(2));
		System.out.println(query(3));
		System.out.println(query(5));
	}
		
	

}
