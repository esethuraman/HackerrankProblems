package main.Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MakeItAnagram {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter s1 and s2");
		String s1 = in.readLine();
		String s2 = in.readLine();
		Map<Character, Integer> set1 = new HashMap<>();
		Map<Character, Integer> set2 = new HashMap<>();
		
		for(char ch = 'a'; ch <= 'z'; ch++){
//			System.out.println(ch);
			set1.put(ch, 0);
			set2.put(ch, 0);
			
		}
		int val = 0;
		for(int i = 0; i < s1.length(); i++){
			char temp = s1.charAt(i);
			val = set1.get(temp);
			set1.put(temp, ++val);
		}
		for(int i = 0; i < s2.length(); i++){
			char temp = s2.charAt(i);
			val = set2.get(temp);
			set2.put(temp, ++val);
		}
//		System.out.println(set1);
		int sum = 0, a = 0 , b = 0;
		for(char ch = 'a'; ch <= 'z'; ch++){
//			System.out.println(ch);
			a = set1.get(ch);
			b = set2.get(ch);
			if(a>b)
				sum = sum + (a-b);
			else
				sum = sum + (b-a);
		}
		
		System.out.println("Sum : "+sum);
		
	}

}
