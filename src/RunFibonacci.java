public class RunFibonacci {
    public static void main(String[] args) {
        FibonacciCalculator f = new FibonacciCalculator();
        for (int i = 0; i <= 19; i++) {
            System.out.println("F(" + i + ")  wynik: " + f.calculateFibonacci(i));
        }
    }
}
