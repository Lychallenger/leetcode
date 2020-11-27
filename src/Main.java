
import java.lang.*;
import java.util.*;

//454. 四数相加 II



class Main {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
                hashMap.put(A[i]+B[j],hashMap.getOrDefault(A[i]+B[j],0)+1);
            }
        }
        int count=0;
        for(int i=0;i<C.length;i++){
            for(int j=0;j<D.length;j++){
                int t=-(C[i]+D[j]);
                if(hashMap.containsKey(t)){
                   count=count+hashMap.get(t);
                }
            }
        }
        return count;
    }

}