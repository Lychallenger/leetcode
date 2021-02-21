import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//1438. 绝对差不超过限制的最长连续子数组

class Main {
    public int longestSubarray(int[] nums, int limit) {
        PriorityQueue<Integer> priorityQueueMax=new PriorityQueue<>();
        PriorityQueue<Integer> priorityQueueMin=new PriorityQueue<>((o1, o2) -> o2-o1);
        int left=0;
        int right=0;
        int max_len=1;
        while (right<nums.length){
            if(priorityQueueMax.isEmpty()||Math.abs(priorityQueueMax.peek()-priorityQueueMin.peek())<=limit){
                max_len=Math.max(right-left,max_len);
                priorityQueueMax.add(nums[right]);
                priorityQueueMin.add(nums[right]);
                right++;
            }
            else{
                priorityQueueMax.remove(nums[left]);
                priorityQueueMin.remove(nums[left]);
                left++;
            }
        }
        if(Math.abs(priorityQueueMax.peek()-priorityQueueMin.peek())<=limit){
            max_len=Math.max(right-left,max_len);
        }
        return max_len;
    }
}