package org.codelity;


public class FunctionDemo {
    int func(int n) {
        int result;
        if (n == 1)
            return 1;
        result = func(n - 1);
        return result;
    }

    public static void main(String[] args) {
        FunctionDemo functionDemo=new FunctionDemo();
        System.out.println(functionDemo.func(5));
    }
}
