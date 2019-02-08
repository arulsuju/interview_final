import java.util.HashMap;
import java.util.Map;

public class HowHashMapWorks {

    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("aaa",1);
        hashMap.put("bbb",2);
        hashMap.put("ccc",3);
        hashMap.put("ddd",4);
        hashMap.put("aaaa",10);
        hashMap.put("bbbb",20);
        hashMap.put("cccc",30);
        hashMap.put("dddd",40);
        hashMap.put("aaaaa",100);
        hashMap.put("bbbbb",200);
        hashMap.put("ccccc",300);
        hashMap.put("ddddd",4000);
        hashMap.put("aaaaaaa",10000);
        hashMap.put("bbbbbbb",20000);
        hashMap.put("ccccccc",30000);
        hashMap.put("ddddddd",40000);
        hashMap.put("aaaaaaaa",10000);
        hashMap.put("bbbbbbbb",20000);
        hashMap.put("cccccccc",30000);
        hashMap.put("dddddddd",40000);
        for(Map.Entry<String,Integer> entry:hashMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
