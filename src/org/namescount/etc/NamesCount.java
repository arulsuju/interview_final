package org.namescount.etc;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static java.util.Map.Entry.comparingByKey;
import static java.util.stream.Collectors.toMap;

/*
* Reads the given file and checks how many times the names are repeated
 */
public class NamesCount {

    ConcurrentHashMap<String,Integer> concurrentHashMap=new ConcurrentHashMap<>();
    ArrayList<String> arrayList=new ArrayList<>();
    public void splitLine(String inputLine){
        arrayList.add(inputLine);
    }
    public void displayNames(){
        for(String s:arrayList){
            System.out.println(s);
        }
    }
    public void countOccurence(){
        int count=0;
        for(int i=0;i<arrayList.size();i++){
            String first=arrayList.get(i);
            for(int j=0;j<arrayList.size();j++) {
                String second=arrayList.get(j);
                if (first.equalsIgnoreCase(second)) {
                    count = count + 1;

                }
            }
            System.out.println(arrayList.get(i) + "found " + count + "times");
            concurrentHashMap.put(arrayList.get(i).toLowerCase(),count);
            count=0;
        }
    }
    public static void main(String[] args) {

        NamesCount namesCount=new NamesCount();
        try
        {
            File file=new File("names.txt");
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String line;
            while((line=bufferedReader.readLine())!=null){
                namesCount.splitLine(line);
        }
            namesCount.displayNames();
            namesCount.countOccurence();
            System.out.println(namesCount.concurrentHashMap);
            for(Map.Entry<String,Integer> entry:namesCount.concurrentHashMap.entrySet()){
                System.out.println("Name "+entry.getKey()+"Found is"+entry.getValue()+"Times");
            }
            /*
            Map<String, Integer> sorted = namesCount.concurrentHashMap.entrySet()
                    .stream()
                    .sorted(comparingByKey())
                    .collect(toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));
            System.out.println(namesCount.concurrentHashMap);
*/

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
