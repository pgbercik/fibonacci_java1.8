package fibonacci;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigInteger;
import java.util.stream.Stream;

public class FibonacciTest {


    @DisplayName("test iterative")
    @ParameterizedTest()
    //pairs of "input number,expectedResult"
    @MethodSource("testDataProvider")
    void testFibIterative(long number, long expectedResult) {
        Assertions.assertThat(FibonacciIterative.calcFibonacci(number)).isEqualTo(expectedResult);
    }

    @DisplayName("test iterative bigInt")
    @ParameterizedTest()
    //pairs of "input number,expectedResult"
    @MethodSource("testDataProvider")
    void testFibIterativeBigInt(long number, BigInteger expectedResult) {
        Assertions.assertThat(FibonacciIterative.calcFibonacciBigInt(number)).isEqualTo(expectedResult);
    }

    @DisplayName("test recursive")
    @ParameterizedTest()
    //pairs of "input number,expectedResult"
    @MethodSource("testDataProvider")
    void testFibRecursive(long number, long expectedResult) {
        Assertions.assertThat(FibonacciRecursive.calcFibonacci(number)).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of("0", "0"),
                Arguments.of("1", "1"),
                Arguments.of("8", "21"),
                Arguments.of("19", "4181"),
                Arguments.of("20", "6765"),
                Arguments.of("43", "433494437"),
                Arguments.of("47", "2971215073"),
                Arguments.of("83", "99194853094755497"),
                Arguments.of("90", "2880067194370816120"),
                Arguments.of("91", "4660046610375530309"),
                Arguments.of("92", "7540113804746346429")
        );
    }


}
