import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//766. 托普利茨矩阵

class Main {
    public boolean isSame(int[][]matrix,int i,int j){
        int begin_value=matrix[i][j];
        while(i<matrix.length&&j<matrix[0].length){
            if(matrix[i][j]==begin_value){
                i=i+1;
                j=j+1;
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length-1;i++){
            if(!isSame(matrix, i, 0)){
                return false;
            }
        }
        for(int j=1;j<matrix[0].length-1;j++){
            if(!isSame(matrix,0,j)){
                return false;
            }
        }
        return true;
    }
}