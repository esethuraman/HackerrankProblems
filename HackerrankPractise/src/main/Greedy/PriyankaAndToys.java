package main.Greedy;

import java.io.*;
import java.util.*;


/**
 * Priyanka works for an international toy company that ships by container. Her task is to the determine the lowest cost way to combine her orders for shipping.
 *
 * She has a list of item weights. The shipping company has a requirement that all items loaded in a container must weigh less than or equal to 4 units plus the weight of the minimum weight item. All items meeting that requirement will be shipped in one container.
 *
 * What is the smallest number of containers that can be contracted to ship the items based on the given list of weights?
 */

// APPROACH: A simple variant of knapsack greedy algorithm
public class PriyankaAndToys {

    // Complete the toys function below.
    static int toys(int[] w) {
        int minContainersCount = 1, first;
        Arrays.sort(w);
        first = w[0];

        for(int itemWeight : w){
            if((itemWeight - first) > 4){
                first = itemWeight;
                minContainersCount++;
            }
        }

        return minContainersCount;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] w = new int[n];

        String[] wItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int wItem = Integer.parseInt(wItems[i]);
            w[i] = wItem;
        }

        int result = toys(w);


        scanner.close();
    }
}

