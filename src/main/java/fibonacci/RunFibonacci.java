package fibonacci;

import java.util.List;

public class RunFibonacci {
    public static void main(String[] args) {
        FibonacciCalculator f = new FibonacciCalculator();
        int n = 20;
        System.out.println("F(" + n + ")  wynik: " + f.calculateFibonacci(n));

        List<Integer> previousResults = f.getPreviousResults();
        for (int i = 0; i < previousResults.size(); i++) {
            System.out.println("F(" + i + ")  wynik: " + previousResults.get(i));
        }



    }
}