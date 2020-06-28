package challenge;

public class Solution3 {
    public static String output(String input){
        String result="";
        String splitString=input;

        for(String splitValue:splitString.split(" "))
        {
            String lowerChange[]=splitValue.split("(?=\\p{Upper})");
            for(int i=0;i<lowerChange.length;i++)
            {
                if(i==0)
                    result=result+" "+lowerChange[i];
                else
                    result=result+"_"+lowerChange[i].toLowerCase();

            }
        }
        System.out.println(splitString);
        System.out.println(result.trim());
        return result.trim().toLowerCase();
    }
    public static void main(String[] args) {
        System.out.println(Solution3.output("HelloWorld"));
    }
}
