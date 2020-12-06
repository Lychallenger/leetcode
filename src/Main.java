
import com.sun.org.apache.regexp.internal.RE;
import org.omg.PortableInterceptor.INACTIVE;

import java.io.FileReader;
import java.lang.*;
import java.util.*;

//659. 分割数组为连续子序列




class Main {

    public boolean isPossible(int[] nums) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        HashMap<Integer,Integer> endHashMap=new HashMap<>();
        for(int t:nums){
            hashMap.put(t,hashMap.getOrDefault(t,0)+1);
        }
        for(int t:nums){
            int count=hashMap.getOrDefault(t,0);
            if(count>0){
                int pre=endHashMap.getOrDefault(t-1,0);
                if(pre>0){
                    hashMap.put(t,count-1);
                    endHashMap.put(t-1,pre-1);
                    endHashMap.put(t,endHashMap.getOrDefault(t,0)+1);
                }
                else{
                    int c1=hashMap.getOrDefault(t+1,0);
                    int c2=hashMap.getOrDefault(t+2,0);
                    if(c1>0&&c2>0){
                        hashMap.put(t,count-1);
                        hashMap.put(t+1,c1-1);
                        hashMap.put(t+2,c2-1);
                        endHashMap.put(t+2,endHashMap.getOrDefault(t+2,0)+1);
                    }
                    else{
                        return false;
                    }
                }
            }

        }
        return true;
    }


}