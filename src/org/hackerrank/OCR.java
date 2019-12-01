package org.hackerrank;

public class OCR {
    public static String expand(String s) {
        final StringBuilder expanded = new StringBuilder();
        boolean isNeedExpandQestionMark = false;
        int K = 0;
        char c = '0';

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (Character.isLetter(c)) {
                if (isNeedExpandQestionMark){
                    for (int j = 0 ; j < K ; j++) {
                        expanded.append('?');
                    }
                    isNeedExpandQestionMark = false;
                }
                expanded.append(c);
            } else {
                if(isNeedExpandQestionMark){
                    K = K * 10 + Character.getNumericValue(c);
                } else {
                    K = Character.getNumericValue(c);
                }
                isNeedExpandQestionMark = true;
            }
        }
        // Case: last part of char is demical number
        if (isNeedExpandQestionMark){
            for (int j = 0 ; j < K ; j++) {
                expanded.append('?');
            }
        }
        return expanded.toString();
    }
    public static boolean Solution(String s, String t) {
        final String expandedS = expand(s);
        final String expandedT = expand(t);

        if (expandedS.length() != expandedT.length()) {
            return false;
        }

        for (int i = 0; i < expandedS.length(); i++) {
            if (expandedS.charAt(i) != '?' && expandedT.charAt(i) != '?'
                    && expandedS.charAt(i) != expandedT.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        OCR ocr=new OCR();
        System.out.println(ocr.Solution("ba1","1Ad"));

    }
}
