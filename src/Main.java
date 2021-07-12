
import java.lang.*;
import java.util.*;

//930. 和相同的二元子数组

class Main {
    public int numSubArraysWithSum(int[] nums, int goal) {
        if(nums.length==0){
            return 0;
        }
        int sum=0;
        int ret=0;
        for(int i=0;i<nums.length;i++){
            int t=nums[i];
            nums[i]=0;//init set to 0;
            nums[sum]=nums[sum]+1;
            sum=sum+t;
            if(sum-goal>=0){
                if(sum-goal<nums.length&&sum-goal<=i)
                    ret=ret+nums[sum-goal];
            }

        }
        return ret;

    }
}