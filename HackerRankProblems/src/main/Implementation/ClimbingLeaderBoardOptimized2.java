package implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ClimbingLeaderBoardOptimized2 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        // your code goes here
        
        for(int level=0; level < m; level++){
        	int[] exArray = computeExclusiveArray(scores);
        	int rank = computeTheRank(exArray, alice[level]);
        	System.out.println(rank);
        }
    }

 
	private static int[] computeExclusiveArray(int[] scores) {
	int[] array = new int[scores.length];
	int arraySize = 0;
	for(int i=0; i<scores.length; i++){
//		adding only exclusive elements by comparing the current key with the previous element in the exArray
		if(arraySize!=0){
			if(scores[i] != array[arraySize-1]){
				array[arraySize] = scores[i];
				arraySize++;
			}
		}
		else{
			array[0] = scores[i];
			arraySize++;
		}
	}
		
	array = Arrays.copyOfRange(array, 0, arraySize);
	return array;

}

	private static int computeTheRank(int[] exArray, int aliceScore) {
		
//		do binary search
		int rank;
		int lowIndex = 0, highIndex = (exArray.length-1), medIndex = (exArray.length/2);
		
		rank = doBinarySearch(exArray, aliceScore, lowIndex, medIndex, highIndex);
				
		return rank;
	}


	private static int doBinarySearch(int[] exArray, int aliceScore, int lowIndex, int medIndex, int highIndex) {
		int rank;
		int high = exArray[lowIndex], low = exArray[highIndex], med = exArray[medIndex];
		/*if(aliceScore > exArray[0])
			return 1;
		if(aliceScore < exArray[exArray.length - 1])
			return exArray.length+1;*/
		while(aliceScore!=med && ((highIndex-lowIndex)!=1)){
			if(aliceScore < med){
				lowIndex = medIndex;
				medIndex = (lowIndex + highIndex) / 2;				
			}
			
			else if(aliceScore >= med){
				highIndex = medIndex;
				medIndex = (lowIndex + highIndex) / 2;
			}
			med = exArray[medIndex];
			
		}
		
		/*if(med == aliceScore)
			return (medIndex);*/
		return (medIndex+1);
		
	}
	
	
}
