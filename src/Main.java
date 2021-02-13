import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//448. 找到所有数组中消失的数字



class Main {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int cur=nums[i]-1;
            while(cur!=-1&&nums[cur]!=-1){
                int tmp=nums[cur]-1;
                nums[cur]=-1;
                cur=tmp;
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=-1){
                list.add(i+1);
            }
        }
        return list;
    }
}