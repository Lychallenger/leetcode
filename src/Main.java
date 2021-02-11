import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//703. 数据流中的第 K 大元素



class Main {
    int k;
    PriorityQueue<Integer> priorityQueue;
    public Main(int k, int[] nums) {
        this.k=k;
        this.priorityQueue=new PriorityQueue<>();
        //init data
        for(int i=0;i<(k>nums.length?nums.length:k);i++){
            priorityQueue.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(nums[i]>priorityQueue.peek()){
                priorityQueue.poll();
                priorityQueue.add(nums[i]);
            }
        }
    }

    public int add(int val) {
        if(priorityQueue.size()<k){
            priorityQueue.add(val);
        }
        else{
            if(val>priorityQueue.peek()){
                priorityQueue.poll();
                priorityQueue.add(val);
            }
        }
        return priorityQueue.peek();
    }
}