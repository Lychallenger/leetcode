
import com.sun.org.apache.regexp.internal.RE;
import org.omg.PortableInterceptor.INACTIVE;

import java.lang.*;
import java.util.*;

//nowcoder 魔术索引I




class Main {

    public boolean findMagicIndex(int[] A, int n) {
        // write code here
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=left+(right-left+1)/2;
            if(A[mid]>mid){
                right=mid-1;
            }
            else if(A[mid]<mid){
                left=mid+1;
            }
            else{
                return true;
            }
        }
        return false;
    }

}