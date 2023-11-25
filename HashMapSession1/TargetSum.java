package HashMapSession1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TargetSum {
	public static void main(String[] args)throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		System.out.println("enter the value in array");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the value of target");
		int target = sc.nextInt();
		Map<Integer, List<Integer>> map = new HashMap<>();
		for(int i = 0;i<n;i++) {
			if(map.containsKey(map.containsKey(arr[i]))) {
				map.get(arr[i]).add(i);
			}
			else {
				List<Integer> list = new ArrayList<>();
				list.add(i);
				map.put(arr[i], list);
				
			}
		}
		for(Integer key : map.keySet()) {
			List<Integer> li = new ArrayList<>();
			int lastElement = li.get(li.size()-1);
			li.remove(li.size()-1);
			map.put(key, li);
			if(map.containsKey(target-key)&&(map.get(target-key)).size()>0) {
				int arr2[] = new int[2];
				arr2[0] = lastElement;
				arr2[1] = map.get(target-key).get(0);
				System.out.println(arr2[0] +" " +arr2[1]);
				return;
			}
			
		}
		System.out.println("you are beyond target");

	}

}
