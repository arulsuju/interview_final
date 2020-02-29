package org.codelity.mutiplechoice;

class SingleClass{
	
	private volatile static SingleClass singleClass;
	
	private SingleClass() {
		
	}
	
	public static synchronized SingleClass getInstances() {
		if(singleClass==null) {
			singleClass=new SingleClass();
		}
		return singleClass;		
	}
	
	public void display() {
		System.out.println("Hello Singleton");
	}
}
public class SingletonDemo {
	public static void main(String[] args) {
		
		SingleClass sobject=SingleClass.getInstances();
		SingleClass sobj2=SingleClass.getInstances();
		System.out.println(sobject);
		sobject.display();
		sobj2.display();
		System.out.println(sobj2);
		
	}

}
