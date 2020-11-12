
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//922. 按奇偶排序数组 II

class Main {

    public int[] sortArrayByParityII(int[] A) {
        int i=0;
        int j=1;
        while(i<A.length&&j<A.length){
            while(i<A.length&&A[i]%2==0)i=i+2;
            while(j<A.length&&A[j]%2==1)j=j+2;
            if(i<A.length&&j<A.length){
                int tmp=A[i];
                A[i]=A[j];
                A[j]=tmp;
            }
        }
        return A;
    }
}