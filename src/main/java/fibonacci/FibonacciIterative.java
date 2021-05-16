package fibonacci;

import java.math.BigInteger;

public final class FibonacciIterative {
    private FibonacciIterative() {
    }

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

    /**
     * An iterative method which utilizes BigInteger data type instead of long.
     */
    public static BigInteger calcFibonacciBigInt(long initNumber) {
        BigInteger result = new BigInteger("0");
        BigInteger nMinus1 = new BigInteger("0");
        BigInteger nMinus2 = new BigInteger("1");

        if (initNumber == 0) return new BigInteger("0");
        else if (initNumber == 1) return new BigInteger("1");

        for (int i = 0; i < initNumber; i++) {
            result = nMinus1.add(nMinus2);
            nMinus2 = nMinus1;
            nMinus1 = result;
        }

        return result;
    }


}
