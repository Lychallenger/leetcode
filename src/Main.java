import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//228. 汇总区间



class Main {

    public List<String> summaryRanges(int[] nums) {

        List<String> result=new ArrayList<>();
        if(nums.length==0){
            return result;
        }
        int i=1;
        int begin=0;
        int end=0;
        while(i<nums.length){
            if(nums[i]-nums[end]==1){
                end=i;
            }
            else{
                //write result
                if(begin==end){
                    result.add(String.valueOf(nums[begin]));
                }
                else{
                    result.add(String.valueOf(nums[begin])+"->"+String.valueOf(nums[end]));

                }
                begin=i;
                end=i;
            }
            i++;
        }
        if(begin==end){
            result.add(String.valueOf(nums[begin]));
        }
        else{
            result.add(String.valueOf(nums[begin])+"->"+String.valueOf(nums[end]));
        }
        return result;
    }
}