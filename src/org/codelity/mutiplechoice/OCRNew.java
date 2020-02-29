package org.codelity.mutiplechoice;

public class OCRNew {
    public static String expand(String eString){
        StringBuffer stringBuffer=new StringBuffer();
        boolean isQuestionMarkneeded=false;
        int K=0;
        char c;
        for(int i=0;i<eString.length();i++){
            c=eString.charAt(i);
            if(Character.isLetter(c)){
            	if(isQuestionMarkneeded) {
            		for(int count=0;count<K;count++) {
            			stringBuffer.append("?");
            		}
            		isQuestionMarkneeded=false;
            	}
                stringBuffer.append(c);
            }
            else{
                if(isQuestionMarkneeded) {
                	K=K*10+Character.getNumericValue(c);
                }
                else {
                	K=Character.getNumericValue(c);
                }
                isQuestionMarkneeded=true;
            }
            
        }
        if(isQuestionMarkneeded) {
            for(int i=0;i<K;i++) {
            	stringBuffer.append("?");
            }
            }
        return stringBuffer.toString();
    }
    public static boolean Solution(String s, String t) {
        final String expandedS = expand(s);
        final String expandedT = expand(t);
        System.out.println(expandedS);
        System.out.println(expandedT);

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
        System.out.println(ocr.Solution("a10b","aaaaaaaaaaab"));
        System.out.println(ocr.Solution("a10","aaaaaaaaaaa"));

    }
}
