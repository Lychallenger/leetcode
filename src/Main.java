
import com.sun.org.apache.regexp.internal.RE;
import org.omg.PortableInterceptor.INACTIVE;

import java.io.FileReader;
import java.lang.*;
import java.util.*;

//1679. K 和数对的最大数目



class Main {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
            hashSet.add(nums[i]);
        }
        int count=0;
        for(Integer t:hashSet){
            int target=k-t;
            if(hashMap.containsKey(target)&&hashMap.containsKey(t)){
                int t1=hashMap.getOrDefault(t,0);
                int t2=hashMap.getOrDefault(target,0);
                if(target==t){
                    if(t1%2==0){
                        hashMap.put(t,0);

                    }
                    else{
                        hashMap.put(t,1);
                    }
                    count=count+t1/2;
                }
                else{
                    if(t1<t2){
                        hashMap.put(t,0);
                        hashMap.put(target,t2-t1);
                        count=count+t1;
                    }
                    else{
                        hashMap.put(target,0);
                        hashMap.put(t,t1-t2);
                        count=count+t2;
                    }
                }
            }
        }
        return count;
    }
}