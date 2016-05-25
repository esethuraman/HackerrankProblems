package main.Implementation;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pangrams {
	public static void main(String[] args){
		Set<Character> set = new HashSet<Character>();

		String str = "a quick brown fox jumps over the lazy dog";
		char tmp;
		int asc;
		for (int i = 0; i < str.length(); i++){
			
			tmp = str.charAt(i);
			asc = (int) tmp;
			if((asc>64 && asc<91) || (asc>96 && asc<123)){
				if((asc>96 && asc<123))
					tmp = (char) (asc-32);
				set.add(tmp);
			}
		}
		
		System.out.println(set);
		if(set.size() == 26){
			System.out.println("pangram");
		}
		else{
			System.out.println("not pangram");
		}
	}
}
