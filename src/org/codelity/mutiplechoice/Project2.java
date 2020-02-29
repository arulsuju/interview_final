package org.codelity.mutiplechoice;
class Rec{
	int func(int n) {
		int result;
		if(n==1) 
		return 1;
		result=func(n-1);
		return result;
		
	}
}
public class Project2 {
	public static void main(String args[]) {
		Rec r=new Rec();
		System.out.println(r.func(5));
		
	}
  
  
}
