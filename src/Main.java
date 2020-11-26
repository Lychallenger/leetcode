
import java.lang.*;
import java.util.*;

//164. 最大间距



class Main {

    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max_dis=0;
        for(int i=0;i<nums.length-1;i++){
            max_dis=Integer.max(max_dis,nums[i+1]-nums[i]);
        }
        return max_dis;
    }

}