import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FibonacciCalculator {
    List<BigInteger> resList = new ArrayList<>();
    BigInteger result=new BigInteger("0");
    BigInteger minus1 = null;
    BigInteger minus2 = null;

    public BigInteger calculateFibonacci(int initNumber) {

        if (initNumber==0) {
            result=result.add(new BigInteger("0"));
            resList.add(result);
        }
        else if (initNumber==1) {
            result=result.add(new BigInteger("1"));
            resList.add(result);
        }
        else {
            minus1=resList.get(initNumber-1);
            minus2=resList.get(initNumber-2);
            result=minus1.add(minus2);

            resList.add(result);
        }

        return result;
    }
}
