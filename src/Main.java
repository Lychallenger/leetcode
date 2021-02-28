import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//896. 单调数列

class Main {
    public boolean isMonotonic(int[] A) {
        if(A.length<2){
            return true;
        }
        else{
            int tag=0;
            int i;
            for(i=0;i<A.length-1;i++){
                if(A[i]<A[i+1]){
                    tag=1;
                    break;
                }
                else if(A[i]>A[i+1]){
                    tag=2;
                    break;
                }
            }
            if(tag==0)return true;
            for(;i<A.length-1;i++){
                if(tag==1){
                    if(A[i]<=A[i+1]){
                        continue;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    if(A[i]>=A[i+1]){
                        continue;
                    }
                    else{
                        return false;
                    }

                }
            }
            return true;
        }
    }
}