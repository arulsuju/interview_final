package org.codelity;

public class OCRJagan {
    static int stringLenghtValidation(String value) {
        StringBuffer alpha = new StringBuffer();
        int num = 0;
        for (int i = 0; i < value.length(); i++) {
            if (Character.isDigit(value.charAt(i)))
                num = num
                        + (Integer.valueOf(String.valueOf((value.charAt(i)))));
            else if (Character.isAlphabetic(value.charAt(i)))
                alpha.append(value.charAt(i));
        }

        return alpha.length() + num;
    }

    static Boolean validateCharacterOrNumberCheck(Character a, Character b) {
        String valuea;
        String valueb;

        if (Character.isDigit(a))
            valuea = "intValue";
        else
            valuea = "charValue";

        if (Character.isDigit(b))
            valueb = "intValue";
        else
            valueb = "charValue";

        if (valuea.equals("intValue") || valueb.equals("intValue"))
            return true;
        else if (String.valueOf(a).equals(String.valueOf(b)))
            return true;

        return false;
    }
    public static void main(String[] args) {
        String value1 = "a10b";
        String value2 = "aaaaaaaaaaab";
        Boolean result = false;

        if (stringLenghtValidation(value1) == stringLenghtValidation(value2)) {
            for (int i = 0; i < (value1.length()/2)+1; i++) {
                if (String.valueOf(value1.charAt(i)).equals(
                        String.valueOf(value2.charAt(i)))
                        || validateCharacterOrNumberCheck(value1.charAt(i),
                        value2.charAt(i))
                        && String.valueOf(
                        value1.charAt(value1.length() - 1 - i)).equals(
                        String.valueOf(value2.charAt(value2.length()
                                - 1 - i)))
                        || validateCharacterOrNumberCheck(
                        value1.charAt(value2.length() - 1 - i),
                        value2.charAt(value2.length() - 1 - i)))
                    result = true;
                else{
                    result = false;
                    break;
                }

            }
        }
        System.out.println("result==>" + result);
    }

}
