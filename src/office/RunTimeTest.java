package office;



import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RunTimeTest {
    public static void main(String[] args)throws Exception {
        String dir = System.getProperty("dir");
        String cmd="cmd.exe /C dir " +dir ;
        System.out.println("first="+cmd);
        String[] cmdArray = new String[4];
        cmdArray[0] = "cmd.exe";
        cmdArray[1] = "/C";
        cmdArray[2] = "dir";
        cmdArray[3] = dir!=null?dir:"null";
        System.out.println(String.valueOf(cmdArray));
        Process proc = Runtime.getRuntime().exec(cmdArray);
        //(or)
        //Process proc = Runtime.getRuntime().exec(new String[] {"cmd.exe","/C","dir",dir!=null?dir:"null"});
        // Process proc = Runtime.getRuntime().exec(cmd);
        InputStream inputStream=proc.getInputStream();
        InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        String msg="";
        StringBuilder temp=new StringBuilder();
        while((msg=bufferedReader.readLine())!=null){
            temp.append(msg);
        }
        System.out.println(temp);
    }
}