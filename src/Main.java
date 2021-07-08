
import java.lang.*;
import java.util.*;

//面试题 17.10. 主要元素

class Main {
    public int majorityElement(int[] nums) {
       int candidate=-1;
       int count=0;
       for(int k:nums){
           if(count==0){
               candidate=k;
           }
           if(k==candidate){
               count++;
           }
           else{
               count--;
           }
       }
       count=0;
       for(int k:nums){
           if(k==candidate){
               count++;
           }
       }
       return count*2>nums.length?candidate:-1;
    }
}