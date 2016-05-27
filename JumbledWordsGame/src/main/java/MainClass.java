package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

public class MainClass {
	public static void main(String[] args) throws IOException{
		String str =" ";
		int count = 0;
		System.out.println("Enter the String : ");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		str = in.readLine();
		
//		int possibilities = new PermutationCalculator(str).getPermutationPossibilities();
//		System.out.println("Permutations : "+ possibilities);
		
		Set<String> listOfAllStrings = new StringsGenerator(str).getAllStrings();
		for(String s : listOfAllStrings){
			System.out.println(s);
			++count;
		}
		
		System.out.println("COunt : "+count);
	}
}
