package main.Implementation;

import java.util.*;

public class Anagram {

	public static void main(String[] args) {
		String str = "dnqaurlplofnrtmh";
		String s1, s2;
		int cnt = 0;
		int len = str.length();
		List<Character> l1 = new LinkedList<>();
		List<Character> l2 = new LinkedList<>();
		
		if( len%2 == 0){
			s1 = str.substring(0,len/2 );
			s2 = str.substring(len/2, len);
			System.out.println(s1+" "+s2);
			for(int i = 0; i < len/2; i++){
				l1.add(s1.charAt(i));
				l2.add(s2.charAt(i));
			}
			Collections.sort(l1);
			Collections.sort(l2);
			System.out.println(l1+ "  "+l2);
//			Now iterate over the lists to find the difference which will be the number of changes to be made to make them anagrams of one another

			Iterator itr2 = l2.iterator();

			

			while(itr2.hasNext()){
				Object tmp = itr2.next();
				boolean flag = l1.contains(tmp);
				if(flag == true){
					l1.remove(tmp);
					
					
				}
				else
					cnt++;
				System.out.println(l1 + " " +tmp);
			}
		}
		else{
			cnt = -1;
		}
		System.out.println(cnt);
		
	}

}
