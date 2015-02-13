package org.aytartana.kata.shuffle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by jonathan on 13/02/15.
 */
public class BestShuffle4Numbers {
    int currentMax;

    public int solution(int A, int B, int C, int D) {
        List<Integer> valueList = Arrays.asList(A, B, C, D);
        currentMax = 0;

        permute(valueList, 0);

        return currentMax;
    }

    private int valueOfF(List<Integer> valueList) {
        int result = Math.abs(valueList.get(0) - valueList.get(1));
        result += Math.abs(valueList.get(1) - valueList.get(2));
        result += Math.abs(valueList.get(2) - valueList.get(3));
        return result;
    }

    private void permute(List<Integer> valueList, int i) {
        for (int element = i; element < valueList.size(); element++) {
            Collections.swap(valueList, element, i);
            permute(valueList, i + 1);
            Collections.swap(valueList, i, element);
        }
        if (i == valueList.size() -1 ) {
          //System.out.println(Arrays.toString(valueList.toArray())) ;
          int value = valueOfF(valueList);
          if (value > currentMax) {
              currentMax = value;
          }
        }
    }
}
