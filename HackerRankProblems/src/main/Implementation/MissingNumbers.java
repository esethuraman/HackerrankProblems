package implementation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MissingNumbers {
	public static void main(String[] args){
//		try{
			Scanner in = new Scanner(System.in);
			
			int sizeOfA = in.nextInt();
			Map<Integer, Integer> mapA = new TreeMap<>();
			Map<Integer, Integer> mapB = new TreeMap<>();
			int element;
		 	
			for(int i=0; i<sizeOfA; i++){
		 		element = in.nextInt();
		 		if(mapA.containsKey(element)){
		 			mapA.put(element, mapA.get(element)+1);
		 		}
		 		else 
		 			mapA.put(element, 1);
			}
			
			int sizeOfB = in.nextInt();
		 	for(int i=0; i<sizeOfB; i++){
		 		element = in.nextInt();
		 		if(mapB.containsKey(element)){
		 			mapB.put(element, mapB.get(element)+1);
		 		}
		 		else 
		 			mapB.put(element, 1);
		 	}
		 	
		 	in.close();
		 	
		 	for(Entry< Integer, Integer> entry : mapB.entrySet()){
		 		if(mapA.containsKey(entry.getKey())){
		 			int a = mapA.get(entry.getKey());
		 			int b = entry.getValue();
		 			if(a != b)
		 				System.out.print(entry.getKey() + " ");
		 		}
		 		else{
		 			System.out.print(entry.getKey() + " ");
		 		}
		 	}
		/*}
		catch(Exception e){
			System.out.println("Exception " + e.getMessage());
		}*/
		
	}
	
	 
}
