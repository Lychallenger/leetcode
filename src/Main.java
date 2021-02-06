import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//888. 公平的糖果棒交换



class Main {

    public int[] fairCandySwap(int[] A, int[] B) {
        int sum1=0;
        int sum2=0;
        //set
        Set<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<B.length;i++){
            sum2=sum2+B[i];
            set.add(B[i]);
        }
        for(int i=0;i<A.length;i++){
            sum1=sum1+A[i];
        }
        int mean=(sum1+sum2)/2;
        int expectValue=sum1-mean;
        for(int i=0;i<A.length;i++){
            if(set.contains(A[i]-expectValue)){
                return new int[]{A[i],A[i]-expectValue};
            }
        }
        return new int[]{};
    }
}