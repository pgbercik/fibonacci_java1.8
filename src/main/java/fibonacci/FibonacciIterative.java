package fibonacci;

public final class FibonacciIterative {
    private FibonacciIterative() {}

    /**
     * This method implements an iterative algorithm for calculating Fibonacci numbers.
     * More details can be found in this link:
     * https://en.wikipedia.org/wiki/Fibonacci_number
     */
    public static long calcFibonacci(long initNumber) {
        long result = 0;
        long nMinus1 = 0;
        long nMinus2 = 1;

        if (initNumber == 0) return 0;
        else if (initNumber == 1) return 1;

        for (int i = 0; i < initNumber; i++) {
            result = nMinus1 + nMinus2;
            nMinus2 = nMinus1;
            nMinus1 = result;
        }

        return result;
    }


}
