import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//485. 最大连续1的个数


class Main {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max_count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                max_count=Math.max(max_count,count);
                count=0;
            }
        }
        max_count=Math.max(max_count,count);
        return max_count;
    }
}