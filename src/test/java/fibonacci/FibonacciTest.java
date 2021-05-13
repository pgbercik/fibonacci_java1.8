package fibonacci;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigInteger;

public class FibonacciTest {
    FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();

    @DisplayName("test Fib BigIntegers; initValue,expectedResult")
    @ParameterizedTest()
    //pairs of "input number,expectedResult"
    @CsvSource({"0,0","1,1","8,21","19,4181","20,6765"})
    void testResultsForFibBigInt(int number, int expectedResult) {
        Assertions.assertThat(fibonacciCalculator.calculateFibonacci(number)).isEqualTo(expectedResult);
    }


}
