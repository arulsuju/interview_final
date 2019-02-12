import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListReadTxt {
    ArrayList<String> arrayList=new ArrayList<>();
    public void addSong(String line){
        String[] token=line.split("/");
        arrayList.add(token[0]);
    }
    public static void main(String[] args) {
        ArrayListReadTxt arrayListReadTxt=new ArrayListReadTxt();
        try
        {
            File file=new File("input.txt");
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line=null;
            while((line=br.readLine())!=null){
                arrayListReadTxt.addSong(line);
            }
            System.out.println(arrayListReadTxt.arrayList);
            Collections.sort(arrayListReadTxt.arrayList);
            System.out.println(arrayListReadTxt.arrayList);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
