package implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClimbingTheLeaderBoard {
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
        	List<Integer> exclusiveList = computeExclusiveList(scores);
        	int rank = computeTheRank(exclusiveList, alice[level]);
        	System.out.println(rank);
        }
    }

 
	private static List<Integer> computeExclusiveList(int[] scores) {
	List<Integer> exList = new ArrayList<Integer>();
	for(int i = 0; i<scores.length; i++){
		if(!exList.contains(scores[i])){
			exList.add(scores[i]);
		}
	}
	return exList;
}

	private static int computeTheRank(List<Integer> exclusiveList, int aliceScore) {
	int i=0;
	for(i=0; i<exclusiveList.size(); i++){
		if(aliceScore >= exclusiveList.get(i)){
			break;
		}
	}
	return i+1;
}
}
