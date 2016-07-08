package main.Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class GameOfThrones {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		Map<Character, Integer> map = new HashMap<>();
		int count;
		for(int i = 0; i < str.length(); i++){
			count = 0;
			if(map.containsKey(str.charAt(i))){
				count = map.get(str.charAt(i));
				map.put(str.charAt(i), ++count );
			}
			else
				map.put(str.charAt(i), 1);
		}
		
		int oddCount = 0;
		for(char c : map.keySet()){
			if((map.get(c)%2) == 0)
					continue;
			else
				oddCount++;
		}
		if((str.length()%2) !=0 && (oddCount == 1)){
			
				System.out.println("YES");
		}
		else if((str.length()%2) == 0 && (oddCount == 0)){
			
				System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		
	}
}
