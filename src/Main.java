import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//54. 螺旋矩阵

class Main {
    public List<Integer> spiralOrder(int[][] matrix) {
        boolean[][] visit=new boolean[matrix.length][matrix[0].length];
        List<Integer> list=new ArrayList<>(matrix.length*matrix[0].length);
        int count=0;
        int i=0,j=0;
        visit[0][0]=true;
        list.add(matrix[0][0]);
        count=1;
        while(count<matrix.length*matrix[0].length){
            //right;
            while(j+1<matrix[0].length&&!visit[i][j+1]){
                visit[i][j+1]=true;
                list.add(matrix[i][j+1]);
                count++;
                j++;
            }
            while(i+1<matrix.length&&!visit[i+1][j]){
                visit[i+1][j]=true;
                list.add(matrix[i+1][j]);
                count++;
                i++;
            }
            while(j-1>=0&&!visit[i][j-1]){
                visit[i][j-1]=true;
                list.add(matrix[i][j-1]);
                count++;
                j--;
            }
            while(i-1>=0&&!visit[i-1][j]){
                visit[i-1][j]=true;
                list.add(matrix[i-1][j]);
                count++;
                i--;
            }

        }
        return list;
    }
}