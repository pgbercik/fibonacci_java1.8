package fibonacci;

public final class FibonacciRecursive {

    private FibonacciRecursive() {

    }

    /**
     * This method implements a recursive algorithm for calculating Fibonacci numbers.
     */
    public static long calcFibonacci(long initNumber) {

        if (initNumber == 0) {
            return 0;
        } else if (initNumber == 1) {
            return 1;
        } else {
            return calcFibonacci(initNumber - 1) + calcFibonacci(initNumber - 2);
        }

    }
}
