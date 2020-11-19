
import java.lang.*;
import java.util.*;

//283. 移动零


class Main {

    public void moveZeroes(int[] nums) {
        int slow =0;
        int fast=0;
        while(fast<nums.length){
            if(nums[fast]!=0){
                int tmp=nums[fast];
                nums[fast]=nums[slow];
                nums[slow]=tmp;
                slow++;
            }
            fast++;
        }
    }

}