import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FibonacciCalculator {
    List<Integer> resList = new ArrayList<>();
    int result=0;

    public Integer calculateFibonacci(int initNumber) {

        if (initNumber==0) {
            result+=0;
            resList.add(result);
        }
        else if (initNumber==1) {
            result+=1;
            resList.add(result);
        }
        else {
            result=resList.get(initNumber-1)+resList.get(initNumber-2);
            resList.add(result);
        }

        return result;
    }
}
