package main.Greedy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class LuckBalance {

    // Complete the luckBalance function below.
    /*

    Lena is preparing for an important coding competition that is preceded by a number of sequential preliminary contests. She believes in "saving luck", and wants to check her theory. Each contest is described by two integers, and :

    is the amount of luck associated with a contest. If Lena wins the contest, her luck balance will decrease by ; if she loses it, her luck balance will increase by .
    denotes the contest's importance rating. It's equal to if the contest is important, and it's equal to if it's unimportant.

    If Lena loses no more than important contests, what is the maximum amount of luck she can have after competing in all the preliminary contests? This value may be negative.

    For example, and:

    Contest		L[i]	T[i]
    1		5	1
    2		1	1
    3		4	0

    If Lena loses all of the contests, her will be . Since she is allowed to lose important contests, and there are only important contests. She can lose all three contests to maximize her luck at . If =11215+4-1=8$.




    approach:
        parse the 2d array and segregate the important and unimportant contests
        sort the important contests in descending order of luck balance
        pick as many as k contests form this important list and add them together (say L1 - these are all lost ny Lena)
        now add the remaining important contests (say W1 these are all won by Lena)
        if k is still not 0, then pick as many as remaining k unimportant contests.add them up (say L2 - these are all
          lost by Lena)
        add remaining unimportant contests. (say W2 - these are all won by Lena)

        return [ (L1 + L2) - (W1 + W2) ]

     */
    static int luckBalance(int n, int k, int[][] contests) {

        List<List<Integer>> segregatedContests = getSegregatedContests(contests);

        List<Integer> importantContests = segregatedContests.get(0);
        List<Integer> unimportantContests = segregatedContests.get(1);

        importantContests.sort(Comparator.reverseOrder());
        unimportantContests.sort(Comparator.reverseOrder());

        System.out.println(getMaxLuckBalance(importantContests, unimportantContests, k));
        return 0;
    }

    private static int getMaxLuckBalance(List<Integer> importantContests, List<Integer> unimportantContests, int k) {
        int index = 0, L1=0, L2=0, W1=0, W2=0;

        int[] maxImpLuck= getMaxLuckAmtHelper(k, importantContests, true);
        L1 = maxImpLuck[0];
        W1 = maxImpLuck[1];

        int[] maxUnimpLuck= getMaxLuckAmtHelper(k, unimportantContests, false);
        L2 = maxUnimpLuck[0];
        W2 = maxUnimpLuck[1];

        return (L1 + L2) - (W1+W2);

    }

    private static int[] getMaxLuckAmtHelper(int k, List<Integer> contests, boolean isImpFlag) {
        int lostAmt =0, wonAmt= 0;
        for(int luckAmt: contests ){
            if((k <= 0) && isImpFlag){
                wonAmt += luckAmt;
            }
            else{
                lostAmt += luckAmt;
            }
            k--;
        }
       return new int[]{lostAmt, wonAmt};
    }

    private static List<List<Integer>> getSegregatedContests(int[][] contests) {
        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(new ArrayList<>());
        resultList.add(new ArrayList<>());

        for(int[] contest : contests){
            if(contest[1] == 1){
                resultList.get(0).add(contest[0]);
            }
            else{
                resultList.get(1).add(contest[0]);
            }
        }
        return resultList;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] contests = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }

        int result = luckBalance(n, k, contests);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
