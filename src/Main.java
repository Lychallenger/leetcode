
import org.omg.PortableInterceptor.INACTIVE;

import java.lang.*;
import java.util.*;

//976. 三角形的最大周长



class Main {

    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        int max=0;
        for(int i=0;i<A.length-2;i++){
            if(A[i]+A[i+1]>A[i+2]){
                max=Math.max(max,A[i]+A[i+1]+A[i+2]);
            }
        }
        return  max;
    }

}