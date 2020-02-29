package org.codelity.mutiplechoice;

public class FibonacciDemo {
	
	static int[] array;
	public int getFib(int len) {
		
		int i;
		array=new int[10];
		array[0]=0;
		array[1]=1;
		for(i=2;i<=len;i++) {
			array[i]=array[i-1]+array[i-2];
		}
		return array[len];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciDemo fibonacciDemo=new FibonacciDemo();
		fibonacciDemo.getFib(3);
		for(int i:array) {
		System.out.println(i);
		}
	}

}
