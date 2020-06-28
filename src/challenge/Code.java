package challenge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Code {
    public static void main(String[] args) {
        String str="she sells sea shells";
        String rex="SsS";
        String replace="X";
        Pattern pattern= Pattern.compile(rex);
        Matcher matcher= pattern.matcher(str);
        String val=matcher.replaceAll(replace);
        System.out.println(val);
    }
}
