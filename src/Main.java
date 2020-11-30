
import com.sun.org.apache.regexp.internal.RE;
import org.omg.PortableInterceptor.INACTIVE;

import java.lang.*;
import java.util.*;

//nowcoder 最大和子矩阵




class Main {

    public  int getMax(int []tmp){
        int max=tmp[0];
        int res=tmp[0];
        for(int i=1;i< tmp.length;i++){
            max=Math.max(tmp[i]+max,tmp[i]);
            res=Math.max(res,max);
        }
        return  res;
    }
    public int sumOfSubMatrix(int[][] mat, int n) {
        // write code here
        int [][] prefix=new int[mat.length+1][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                prefix[i+1][j]=prefix[i][j]+mat[i][j];
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<prefix.length;i++){
            for(int j=i+1;j<prefix.length;j++){
                int []tmp=new int[mat[0].length];
                for(int k=0;k<mat[0].length;k++){
                    tmp[k]=prefix[j][k]-prefix[i][k];
                }
                max=Math.max(max,getMax(tmp));
            }
        }
        return max;
    }

}