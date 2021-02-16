import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//561. 数组拆分 I


class Main {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ret=0;
        for(int i=0;i<nums.length;i=i+2){
            ret=ret+nums[i];
        }
        return ret;
    }
}