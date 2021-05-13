package fibonacci;

import java.util.ArrayList;
import java.util.List;

public class FibonacciCalculator {

    List<Integer> resList;
    int result=0;

    public Integer calculateFibonacci(int initNumber) {
        resList = new ArrayList<>();
        result=0;

        for (int i=0;i<=initNumber;i++) {
            if (i==0) {
                result=0;
                resList.add(result);
            }
            else if (i==1) {
                result+=1;
                resList.add(result);
            }
            else {
                result=resList.get(i-1)+resList.get(i-2);
                resList.add(result);
            }
        }

        return result;
    }

    public List<Integer> getPreviousResults() {
        List<Integer> tempList = new ArrayList<>(resList);
        tempList.remove(tempList.size()-1);
        System.out.println("resList:  "+resList);
        System.out.println("tempList: "+tempList);
        return tempList;

    }

}
