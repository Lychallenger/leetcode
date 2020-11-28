
import org.omg.PortableInterceptor.INACTIVE;

import java.lang.*;
import java.util.*;

//493. 翻转对



class Main {

    public  int binary(List<Integer> list,int k){//upper bound;
        int left=0;
        int right=list.size()-1;
        while(left<right){
            int mid=left+(right-left+1)/2;
            if(list.get(mid)<=k){
                left=mid;
            }
            else{
                right=mid-1;
            }
        }
        return  left;
    }
    public int reversePairs(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        list.sort(Comparator.comparingInt(o -> o));
        int count=0;
        int target;
        for(int i=0;i<nums.length;i++){
            int t=nums[i];
            int id=binary(list,t);//search data
            //remove data
            list.remove(id);
            //search target;
            if(t>=0){
                if(t%2==0){
                    target=t/2-1;
                }
                else{
                    target=t/2;
                }
            }
            else{
                if((-t)%2==0){
                    target=t/2-1;
                }
                else{
                    target=t/2-1;
                }
            }

            int off=binary(list,target);
            if(off<list.size()&&list.get(off)<=target){
                count=count+off+1;
            }
        }
        return  count;
    }

}