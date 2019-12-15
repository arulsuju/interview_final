package org.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



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
        return 1;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
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

        int result = Result.countCandies(friends_nodes, friends_from, friends_to, friends_weight);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

