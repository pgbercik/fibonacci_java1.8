package fibonacci;

import java.util.List;

public class RunFibonacci {
    public static void main(String[] args) {

        System.out.println("Iterative");
        int n = 50;
        System.out.println("F(" + n + ")  wynik: " + FibonacciIterative.calcFibonacci(n));


        System.out.println("----------------");
        System.out.println("Recursive");
        System.out.println(System.currentTimeMillis());

        System.out.println("F(" + n + ")  wynik: "+FibonacciRecursive.calcFibonacci(n));
        System.out.println(System.currentTimeMillis());


    }
}