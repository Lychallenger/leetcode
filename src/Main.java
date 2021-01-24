import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//674. 最长连续递增序列



class Main {

    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int max=1;
        int tmp=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]>nums[i]){
                tmp++;
            }
            else{
                tmp=1;
            }
            max=Math.max(tmp,max);
        }
        return max;
    }
}