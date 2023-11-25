package HashMapSession2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CommonCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String arr[] = new String[n];
		System.out.println("enter the string ::");
		for(int i = 0;i<n;i++) {
			arr[i] = sc.next();
		}
		String str = arr[0];
		Map<Character,Integer> map = new HashMap<>();
		for(int i = 0;i<str.length();i++) {
			char c = str.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(int i= 1;i<arr.length;i++) {
			String newstr = arr[i];
			Map<Character, Integer> kmap = new HashMap<>();
			for(int i1 = 0;i1<newstr.length();i1++) {
				char ch = newstr.charAt(i1);
				kmap.put(ch, Math.min(kmap.get(kmap),kmap.get(kmap)));
				
			}
			for(Character key : map.keySet()) {
				if(kmap.containsKey(key)) {
					kmap.put(key, Math.min(map.get(key), kmap.get(key)));
				}
				else {
					map.put(key, 0);
				}
			}
		}
		List<String> list = new ArrayList<>();
		for(Character key: map.keySet()) {
			if(map.get(key)>0) {
				for(int i = 0;i<map.get(key);i++) {
					list.add(key+"");
				}
			}
		}
		System.out.println(list);
	}

}
