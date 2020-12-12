
import com.sun.org.apache.regexp.internal.RE;
import org.omg.PortableInterceptor.INACTIVE;

import java.io.FileReader;
import java.lang.*;
import java.util.*;

//376. 摆动序列



class Main {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<2){
            return nums.length;
        }
        int [] up=new int[nums.length];
        int [] down=new int[nums.length];
        up[0]=1;
        down[0]=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                up[i]=Math.max(up[i-1],down[i-1]+1);
                down[i]=down[i-1];
            }
            else if(nums[i]<nums[i-1]){
                down[i]=Math.max(down[i-1],up[i-1]+1);
                up[i]=up[i-1];
            }
            else{
                down[i]=down[i-1];
                up[i]=up[i-1];
            }
        }
        return Math.max(up[nums.length-1],down[nums.length-1]);
    }
}