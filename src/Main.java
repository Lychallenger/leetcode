import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//1052. 爱生气的书店老板

class Main {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int total_sum=0;
        for(int i=0;i<Math.min(grumpy.length,customers.length);i++){
            if(grumpy[i]==0){
                total_sum=total_sum+customers[i];
            }
        }
        int left=0;
        int right=0;
        int tmp_sum=0;
        int max_sum=0;
        while(right<customers.length){
            if(right<X){
                if(grumpy[right]==1){
                    tmp_sum=tmp_sum+customers[right];
                }
                right++;
            }
            else{
                if(grumpy[left]==1){
                    tmp_sum=tmp_sum-customers[left];
                }
                left++;
                if(grumpy[right]==1){
                    tmp_sum=tmp_sum+customers[right];
                }
                right++;
            }
            max_sum=Math.max(max_sum,tmp_sum+total_sum);
        }
        return max_sum;
    }
}