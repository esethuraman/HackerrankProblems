package main.Implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NewYearChaos {
	static Map<Integer, Integer> bribeCountMap = new HashMap<>();
	static int noOfBribes = 0;
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for(int a0 = 0; a0 < T; a0++){
        	boolean isPrintableOutput = true;
        	noOfBribes = 0;
            int n = in.nextInt();
            int q[] = new int[n];
            for(int q_i=0; q_i < n; q_i++){
                q[q_i] = in.nextInt();
            }
            // your code goes here
            initBribeCountArray(q);
            isPrintableOutput = estimateTheChaos(q);
            if(isPrintableOutput==true){
            	System.out.println("Bribes : "+ noOfBribes);
//              System.out.println(noOfBribes);
            }
            
            
        }
        
    }

	private static void initBribeCountArray(int[] q) {
		for(int element : q){
			bribeCountMap.put(element, 0);
		}
		
	}

	private static boolean estimateTheChaos(int[] arr) {
		
		try{
			
			InfiniteLoop: while(true){
				boolean isArrayAffected = false;
	        	for(int i=0; i < (arr.length-1); i++){
	        		if(arr[i] < arr[i+1]){
	        			continue;
	        		}
	        		else{
	        			isArrayAffected = true;
	        			bribeCountMap.put(arr[i],(bribeCountMap.get(arr[i])+1));
	        			
	        				if(bribeCountMap.get(arr[i]) > 2){
	            				throw new Exception();
	            			}
	        				else{
	        					noOfBribes++;
	        					
	        					arr[i] = arr[i] + arr[i+1];
	        					arr[i+1] = arr[i] - arr[i+1];
	        					arr[i] = arr[i] - arr[i+1];
	        				}
	        			
	        		}
	        		
	        	}
	        	if(isArrayAffected==false){
	        		break InfiniteLoop;
	        	}
	        	
			} 
			return true;
	     }
		catch(Exception e){
			System.out.println("Too chaotic");
			return false;
		}
	}
}
