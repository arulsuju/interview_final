package org.codelity;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
public class BalancedBrackets {
    static HashMap<Character, Character> bMap;

    static {
        bMap = new HashMap<>();
        bMap.put('(', ')');
        bMap.put('[', ']');
        bMap.put('{', '}');
    }

    static String isBalanced(String str) {
        /*
        char[] input=str.toCharArray();
        */

        /*if ((str.length() % 2) != 0) {
            return "FALSE";
        }*/
        Stack<Character> stack = new Stack<>();
        for(int i=0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if(ch.equals('(')||ch.equals(')')||ch.equals('{')||ch.equals('}')||ch.equals('[')||ch.equals(']')) {
                if (bMap.containsKey(ch)) {
                    stack.push(ch);
                } else if (stack.isEmpty() || ch != bMap.get(stack.pop())) {
                    return "FALSE";
                }
            }
        }

        return stack.isEmpty()? "TRUE": "FALSE";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println(isBalanced("(the[is]{valid})"));
        System.out.println(isBalanced("(the[is]{valid))"));
        System.out.println(isBalanced("{the(is[valid])}"));
        System.out.println(isBalanced("(this](is}{valid)"));
        System.out.println(isBalanced("(this)(is){valid}"));
        System.out.println(isBalanced("(this)(is){valid}"));

    }

}
