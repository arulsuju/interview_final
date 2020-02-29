package org.codelity.mutiplechoice;
interface MainInterface{
	public void method1();
	public void method2();
	public void method3();
}
abstract class MainAbstract implements MainInterface{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Method1");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Method2");
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("Method3");
		
	}
	
}
public class Interface_limited extends MainAbstract {
	public static void main(String[] args) {
		
		MainAbstract abstract1=new Interface_limited();
		abstract1.method1();
		abstract1.method2();
		
		
	}

}
