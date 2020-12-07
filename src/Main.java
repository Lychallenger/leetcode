
import com.sun.org.apache.regexp.internal.RE;
import org.omg.PortableInterceptor.INACTIVE;

import java.io.FileReader;
import java.lang.*;
import java.util.*;

//861. 翻转矩阵后的得分




class Main {

    public int matrixScore(int[][] A) {
        int ans=(1<<(A[0].length-1))*A.length;
        for(int j=1;j<A[0].length;j++){
            int ct=0;
            for(int i=0;i<A.length;i++){
                if(A[i][j]==A[i][0])ct++;
            }
            int max=Math.max(ct,A.length-ct);
            ans=ans+(1<<(A[0].length-1))*max;
        }
        return ans;
    }


}