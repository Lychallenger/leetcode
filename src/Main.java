import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//697. 数组的度

class arr{
    int left;
    int right;
    int count;
    arr(int left){
        this.left=left;
        this.right=left;
        this.count=1;
    }
}
class Main {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,arr> hashMap=new HashMap<>();
        int max_count=0;
        for(int i=0;i<nums.length;i++){
            if(!hashMap.containsKey(nums[i])){
                hashMap.put(nums[i],new arr(i));
            }
            else{
                hashMap.get(nums[i]).right=i;
                hashMap.get(nums[i]).count++;
            }
            max_count=Math.max(hashMap.get(nums[i]).count,max_count);
        }
        int max_len=Integer.MAX_VALUE;
        for(Integer keys:hashMap.keySet()){
            if(hashMap.get(keys).count==max_count){
                max_len=Math.min(max_len,hashMap.get(keys).right-hashMap.get(keys).left+1);
            }
        }
        return max_len;
    }
}