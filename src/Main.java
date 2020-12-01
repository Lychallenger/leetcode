
import com.sun.org.apache.regexp.internal.RE;
import org.omg.PortableInterceptor.INACTIVE;

import java.lang.*;
import java.util.*;

//34. 在排序数组中查找元素的第一个和最后一个位置




class Main {

    public int lower_bound(int []nums,int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]<target){
                left=mid+1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                right=mid-1;
            }
        }
        return  left;
    }
    public int upper_bound(int []nums,int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left+1)/2;
            if(nums[mid]<target){
                left=mid+1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return  right;
    }
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0){
            return new int[]{-1,-1};
        }
        else{
            int x1=lower_bound(nums,target);
            if(x1<0||x1>=nums.length)return new int[]{-1,-1};
            if(nums[x1]!=target){
                return new int[]{-1,-1};
            }
            else{
                int x2=upper_bound(nums,target);
                return new int[]{x1,x2};
            }
        }
    }




}