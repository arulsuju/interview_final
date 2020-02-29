package org.codelity.mutiplechoice;
class Exc0 extends Exception{
	
}
class Exc1 extends Exc0{
	
}
public class DemoApp {
public static void main(String args[]) {
	try {
		throw new Exc1();
	}
	catch (Exc0 e0) {
		System.out.println("Exo caught");
		// TODO: handle exception
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("Exception caught");
	}
}
}
