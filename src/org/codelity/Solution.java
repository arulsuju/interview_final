package org.codelity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


class Result {

    /*
     * Complete the 'countCandies' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER friends_nodes
     *  2. INTEGER_ARRAY friends_from
     *  3. INTEGER_ARRAY friends_to
     *  4. INTEGER_ARRAY friends_weight
     */

    public static int countCandies(int friends_nodes,
                                   List<Integer> friends_from,
                                   List<Integer> friends_to,
                                   List<Integer> friends_weight) {

        // Write your code here
        /*
        *List<Integer> friends_from=new ArrayList<>();
        friends_from.add(1);
        friends_from.add(7);
        friends_from.add(5);
        friends_from.add(10);
        friends_from.add(6);
        friends_from.add(2);
        int[] friends_from1={1,7,5,10,6,2}
         */
        int[] friends_from1=new int[friends_from.size()];
        for(int i=0;i<friends_from.size();i++){
            friends_from1[i]=friends_from.get(i);
        }
       /*int[] friends_from1=friends_from.stream()
                .mapToInt(Integer::intValue)
                .toArray();*/
        /*int[] friends_to1=friends_to.stream()
                .mapToInt(Integer::intValue)
                .toArray();*/
        int[] friends_to1=new int[friends_to.size()];
        for(int i=0;i<friends_to.size();i++){
            friends_to1[i]=friends_to.get(i);
        }

        int[] friends_weight1=friends_weight.stream()
                .mapToInt(Integer::intValue)
                .toArray();



        int res = 0, max_weight = 0;

        // loop to traverse all weight
        for (int i = 0; i < friends_nodes; i++) {
            // check if weight is more than max weight
            if (friends_weight1[i] > max_weight) {
                // calculate res as multiply of from and to
                res = friends_from1[i] * friends_to1[i];
                // set max weight
                max_weight = friends_weight1[i];
            }
        }
        // return result
        return res;


    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        /*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int friends_nodes = Integer.parseInt(bufferedReader.readLine().trim());

        int friends_fromCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> friends_from = new ArrayList<>();

        for (int i = 0; i < friends_fromCount; i++) {
            int friends_fromItem = Integer.parseInt(bufferedReader.readLine().trim());
            friends_from.add(friends_fromItem);
        }

        int friends_toCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> friends_to = new ArrayList<>();

        for (int i = 0; i < friends_toCount; i++) {
            int friends_toItem = Integer.parseInt(bufferedReader.readLine().trim());
            friends_to.add(friends_toItem);
        }

        int friends_weightCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> friends_weight = new ArrayList<>();

        for (int i = 0; i < friends_weightCount; i++) {
            int friends_weightItem = Integer.parseInt(bufferedReader.readLine().trim());
            friends_weight.add(friends_weightItem);
        }
        */
        int friends_nodes=6;
        List<Integer> friends_from=new ArrayList<>();
        friends_from.add(1);
        friends_from.add(7);
        friends_from.add(5);
        friends_from.add(10);
        friends_from.add(6);
        friends_from.add(2);
        List<Integer> friends_to=new ArrayList<>();
        friends_to.add(2);
        friends_to.add(3);
        friends_to.add(6);
        friends_to.add(8);
        friends_to.add(9);
        friends_to.add(3);
        List<Integer> friends_weight=new ArrayList<>();
        friends_weight.add(51);
        friends_weight.add(51);
        friends_weight.add(100);
        friends_weight.add(200);
        friends_weight.add(51);
        friends_weight.add(62);
        int result = Result.countCandies(friends_nodes, friends_from, friends_to, friends_weight);
        System.out.println(result);
       // bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

       // bufferedReader.close();
        //bufferedWriter.close();
        //output 2
    }
}

