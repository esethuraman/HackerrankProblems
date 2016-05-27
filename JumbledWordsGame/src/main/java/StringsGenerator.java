package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringsGenerator {
	String str;
	Map<String, Boolean> map = new HashMap<>();
	
	StringsGenerator(String str){
		this.str = str;
	}
	
	public Set<String> getAllStrings(){
		map.put(str, false);
		for(int i = 0; i < str.length(); i++){
			List<String> parentStrings = getParentArray();
			for(String s : parentStrings){
				changeVisitedStatus(s);
				for(int j = 1; j < s.length(); j++){
					str = swapCharacters(s, j);
					putInMap(str);
				}
			}
		}
		return map.keySet();
	}
	
	private void putInMap(String str2) {
		if(!(map.containsKey(str2))){
			map.put(str2, false);
		}
		
	}
	
	public String swapCharacters(String s, int position){
		
		char[] arr = s.toCharArray();
//		System.out.println(arr[0]+arr[1]+arr[2]);
		char temp = arr[0];
		arr[0] = arr[position];
		arr[position] = temp;
		str = String.valueOf(arr);
//		System.out.println(" "+arr[0]+arr[1]+arr[2]);
		return str;
		
	}

	@SuppressWarnings({ "unchecked", "unused" })
	private List<String> getParentArray(){
		List<String> list = new ArrayList<>();
		for(Entry<String, Boolean> mapEntry : map.entrySet()){
			if(map.containsValue(false)){
				list.add(mapEntry.getKey());
			}
		}
		return list;
		
	}
	
	private void changeVisitedStatus(String str3){
		map.put(str3, true);
	}
	
}
