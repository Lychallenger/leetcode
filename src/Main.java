import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//480. 滑动窗口中位数



class Main {

    int binarySearch(List<Integer> list,int target){
        int left=0;
        int right=list.size();
        while(left<right){
            int middle=(left+right)/2;
            if(list.get(middle)>=target){
                right=middle;
            }
            else{
                left=middle+1;
            }

        }
        return left;
    }
    public double[] medianSlidingWindow(int[] nums, int k) {
        double [] result=new double[nums.length-k+1];
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<k;i++){
            list.add(nums[i]);
        }
        list.sort((Comparator.comparingInt(o -> o)));
        if(k%2==0){
            result[0]=((double) list.get(k/2-1)+(double) list.get(k/2))/2;
        }
        else{
            result[0]=list.get(k/2);
        }
        for(int i=k;i<nums.length;i++){
            //step 1 remove left
            int location=binarySearch(list,nums[i-k]);
            list.remove(location);
            //step 2 add right
            location=binarySearch(list,nums[i]);
            list.add(location,nums[i]);
            //step 3 add middle result;
            if(k%2==0){
                result[i-k+1]=((double) list.get(k/2-1)+(double) list.get(k/2))/2;
            }
            else{
                result[i-k+1]=list.get(k/2);
            }

        }
        return result;

    }

    public static void main(String[] args) {
        int [] arr={1,3,-1,-3,5,3,6,7};
        int target=3;
        new Main().medianSlidingWindow(arr,target);
    }
}