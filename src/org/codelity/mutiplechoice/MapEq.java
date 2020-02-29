package org.codelity.mutiplechoice;
import java.util.*;

public class MapEq {
 public static void main(String args[]) {
	 Map<ToDos,String> m=new HashMap<ToDos,String>();
	 ToDos t1=new ToDos("Monday");
	 ToDos t2=new ToDos("Monday");
	 ToDos t3=new ToDos("Tuesday");
	 m.put(t1,"do laundry");
	 m.put(t2,"pay bills");
	 m.put(t3,"clean");
	 System.out.println(m.size());
	 
	 
 }
 class ToDos{
	 String day;
	 ToDos(String d){
		 day=d;
	 }
	 public boolean equals(Object o) {
		 return ((ToDos)o).day==this.day;
	 }
 }
}
