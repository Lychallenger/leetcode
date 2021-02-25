import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//867. 转置矩阵

class Main {
    public int[][] transpose(int[][] matrix) {
        int [][] ret=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                int tmp=matrix[j][i];
                ret[i][j]=tmp;
            }
        }
        return ret;
    }
}