import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class RunFibonacci {
    public static void main(String[] args) {
        FibonacciCalculator f = new FibonacciCalculator();
        for (int i = 0; i <= 399; i++) {

            //for results in scientific notation
            NumberFormat formatter = new DecimalFormat("0.####E0", DecimalFormatSymbols.getInstance(Locale.ROOT));
            System.out.println("F(" + i + ")  wynik: " + formatter.format(f.calculateFibonacci(i)));

            //for raw results
//            System.out.println("F(" + i + ")  wynik: " + f.calculateFibonacci(i));

        }
    }
}
