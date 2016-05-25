package main.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GemStones {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the no of elements ...");
		int n = Integer.parseInt(in.readLine());
		Set<String> gemSet = new HashSet<String>();
		String[] elements = new String[n];
		int gemElements = 0;
		for(int i = 0 ; i < n; i++){
//			System.out.println("Enter the elements ... ");
			elements[i] = in.readLine();
			gemSet.add(elements[i]);
		}
		Iterator itr = gemSet.iterator();
		String first = (String) itr.next();
		char[] firstInSetAsCharArray = (first).toCharArray();
		Set<Character> charArraySet = new HashSet<>();
		for(char c : firstInSetAsCharArray){
			charArraySet.add(c);
		}
		
		int cnt;
//			System.out.println( temp);
			for(char ch : charArraySet){
				Set<String> temp = gemSet;

				cnt = 1;
				itr = gemSet.iterator();
				itr.next();
				while(itr.hasNext()){
				String hashSetString= (String) itr.next();
//				System.out.println(ch);
				String charSeq = String.valueOf(ch);
				if((hashSetString).contains(charSeq)){
//						System.out.println(hashSetString+" : "+charSeq);
					cnt++;
					continue;
				}
			}
			if(cnt == gemSet.size())
				gemElements++;
		}
//		System.out.println("The gem elements count is :");
		System.out.println(gemElements);
		

	}

}
