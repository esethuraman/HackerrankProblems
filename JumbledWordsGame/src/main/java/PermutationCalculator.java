package main.java;

import java.util.HashMap;
import java.util.Map;

public class PermutationCalculator {
	String str;
	public PermutationCalculator(String str){
		this.str = str;
	}
	
	public int getPermutationPossibilities(){
		
		Map<Character, Integer> charCountMap = getCharCountMap();
		int denominator = 1;
		for(char key : charCountMap.keySet()){
			denominator=denominator*getFactorial(charCountMap.get(key));
		}
		return((getFactorial(str.length()))/denominator);	
	}
	
	private Map<Character, Integer> getCharCountMap() {
		
		Map<Character, Integer> charCountMap= new HashMap<>();
		for(char c : str.toCharArray()){
			if(charCountMap.containsKey(c)){
				int temp = charCountMap.get(c);
				charCountMap.put(c, (temp+1));
			}
			else{
				charCountMap.put(c, 1);
			}
		}
		return charCountMap;
	}
	
	private int getFactorial(int n) {
		int result=1;
		if( n == 0)
			return 1;
		for(int i = 1; i <= str.length(); i++ ){
			 result = n * getFactorial(n-1);
		}
		System.out.println("Factorial result : "+ n);
		return result;
	}

}
