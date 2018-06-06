package main.Greedy;

import java.io.IOException;
import java.util.*;

/**
 * Jim's Burgers has a line of hungry customers. Orders vary in the time it takes to prepare them. The task is to determine the order the customers receive their orders.
 *
 * To do this, start by numbering each of the customers from to , front of the line to the back. You will then be given an order number and a preparation time for each customer.
 *
 * The time of delivery is calculated as the sum of the order number and the preparation time. If two orders are delivered at the same time, assume they are delivered in ascending customer number order.
 *
 * For example, there are customers in line. They each receive an order number and a preparation time .:
 *
 * Customer	1	2	3	4	5
 * Order #		8	5	6	2	4
 * Prep time	3	6	2	3	3
 * Calculate:
 * Serve time	11	11	8	5	7
 *
 * We see that the orders are delivered to customers in the following order:
 *
 * Order by:
 * Serve time	5	7	8	11	11
 * Customer	4	5	3	1	2
 */

/**
 *
 * APPROACH: as and when the order times are computed, add their OrderNumber in to the TreeMap whose keys are the order
 *           times and values are the orderNumbers. The values are TreeSet.
 *           This way, both inner collection (Treeset) and outer collection (TreeMap) are sorted
 *           So, when the inner collections are deflated and values collectively expressed, the result is obtained
 */
public class JimAndTheOrders {
    // Complete the jimOrders function below.
    static int[] jimOrders(int[][] orders) {
        Map<Integer, Set<Integer>> compoundMap = new TreeMap<Integer, Set<Integer>>();
        int key;
        for(int i=0; i<orders.length; i++){

            // total time taken = order time + preparation time
            key = orders[i][0] + orders[i][1];

            // populating the inner set
            if(compoundMap.containsKey(key)){

                // effectively customer orders are numbered from 1 and not from 0.
                // so add (i+1) and not i in to the set
                compoundMap.get(key).add(i+1);
            }
            else{
                Set<Integer> set = new TreeSet<Integer>();
                set.add(i+1);
                compoundMap.put(key, set);
            }
        }

        // deflating the tree map's values (which in turn are tree sets) to the output array
        int[] result = new int[orders.length];
        int index = 0;
        for(Map.Entry entry : compoundMap.entrySet()){
            for(int a : (Set<Integer>) entry.getValue()){
                result[index++] = a;
            }
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] orders = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] ordersRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int ordersItem = Integer.parseInt(ordersRowItems[j]);
                orders[i][j] = ordersItem;
            }
        }

        int[] result = jimOrders(orders);
        System.out.println(result);

//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
//            }
//        }

//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
