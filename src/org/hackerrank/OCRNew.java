package org.hackerrank;

public class OCRNew {
    public static String expand(String eString){
        StringBuffer stringBuffer=new StringBuffer();
        char c;
        for(int i=0;i<eString.length();i++){
            c=eString.charAt(i);
            if(Character.isLetter(c)){
                stringBuffer.append(c);
            }
            else{
                int K=Integer.parseInt(String.valueOf(eString.charAt(i)));
                for(int count=0;count<K;count++){
                    stringBuffer.append("?");
                }
            }
        }
        return stringBuffer.toString();
    }
    public static boolean Solution(String s, String t) {
        final String expandedS = expand(s);
        final String expandedT = expand(t);
        //System.out.println(expandedS);
        //System.out.println(expandedT);

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
        OCRNew ocr=new OCRNew();
        System.out.println(ocr.Solution("ba1","1Ad"));
        System.out.println(ocr.Solution("A2Le","1ppLe"));
        System.out.println(ocr.Solution("ba1","1Ad"));
    }
}
