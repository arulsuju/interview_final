package org.codelity.mutiplechoice;
import java.util.*;
public class Project1 {
	public static void main(String args[]) {
		List l=new ArrayList();
		l.add("1");
		l.add("2");
		l.add("3");
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
				{
			l.add("4");
				}
	}

}
