package org.sumit;



public class May251 {
    public static String firstRepeatingLetter(String s) {
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            for(int j = i+1; j < s.length(); j++){
                if(c == s.charAt(j))
                    return String.valueOf(s.charAt(j));
            }
        }
        return String.valueOf(-1);
    }
    public static void main(String[] args) {
        System.out.println(firstRepeatingLetter("abcba"));

    }
}
