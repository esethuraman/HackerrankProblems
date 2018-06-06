package main.Greedy;


import java.util.Arrays;
import java.util.Scanner;

public class SherlockAndBeast {
    /**
     * Sherlock Holmes suspects his archenemy Professor Moriarty is once again plotting something diabolical. Sherlock's companion, Dr. Watson, suggests Moriarty may be responsible for MI6's recent issues with their supercomputer, The Beast.
     *
     * Shortly after resolving to investigate, Sherlock receives a note from Moriarty boasting about infecting The Beast with a virus. He also gives him a clue: an integer. Sherlock determines the key to removing the virus is to find the largest Decent Number having that number of digits.
     *
     * A Decent Number has the following properties:
     *
     *     Its digits can only be 3's and/or 5's.
     *     The number of 3's it contains is divisible by 5.
     *     The number of 5's it contains is divisible by 3.
     *     It is the largest such number for its length.
     *
     * Moriarty's virus shows a clock counting down to The Beast's destruction, and time is running out fast. Your task is to help Sherlock find the key before The Beast is destroyed!
     */
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            System.out.println(findDecentNumber(n));
        }

        scanner.close();
    }


    private static String findDecentNumber(int n) {
        int fivesCount = n, threesCount = 0;
        while(fivesCount%3 != 0 ){
            // allocating space for the 3s
            fivesCount = fivesCount-5;
            threesCount += 5;

            if(fivesCount < 0){
                return "-1";
            }
        }

        return generateDecentNumber(fivesCount, '5') + generateDecentNumber(threesCount, '3');


    }

    private static String generateDecentNumber(int count, char entry) {
        char[] arr = new char[count];
        for(int i=0; i<count; i++){
            arr[i] = entry;
        }
        return String.valueOf(arr);
    }
}