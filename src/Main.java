import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//643. 子数组最大平均数 I



class Main {

    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        int max_sum=Integer.MIN_VALUE;
        for(int i=k;i<nums.length;i++){
            max_sum=Math.max(max_sum,sum);
            //step 1 remove left;
            sum=sum-nums[i-k];
            //step 2 add right;
            sum=sum+nums[i];
        }
        max_sum=Math.max(max_sum,sum);
        return (double)max_sum/k;
    }
}