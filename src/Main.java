import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//73. 矩阵置零

class Main {
    public void setZeroes(int[][] matrix) {
        boolean leftTag=false;
        boolean rightTag=false;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    if(i==0&&j==0){
                        leftTag=true;
                        rightTag=true;
                    }
                    else if(i==0){
                        rightTag=true;
                    }
                    else if(j==0){
                        leftTag=true;
                    }
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            if(matrix[i][0]==0){
                for(int j=0;j<matrix[0].length;j++){
                    matrix[i][j]=0;
                }
            }
        }

        for(int j=1;j<matrix[0].length;j++){
            if(matrix[0][j]==0){
                for(int i=0;i<matrix.length;i++){
                    matrix[i][j]=0;
                }
            }
        }
        if(matrix[0][0]==0){
            if(leftTag){
                for(int i=0;i<matrix.length;i++){
                    matrix[i][0]=0;
                }
            }
            if(rightTag){
                for(int j=0;j<matrix[0].length;j++){
                    matrix[0][j]=0;
                }
            }

        }
    }
}