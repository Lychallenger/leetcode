import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//566. 重塑矩阵


class Main {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(r*c!=nums.length*nums[0].length){
            return nums;
        }
        int [][] ret=new int[r][c];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                int count=i*nums[0].length+j;
                ret[count/c][count%c]=nums[i][j];
            }
        }
        return ret;
    }
}