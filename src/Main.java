
import com.sun.org.apache.regexp.internal.RE;
import org.omg.PortableInterceptor.INACTIVE;

import java.io.FileReader;
import java.lang.*;
import java.util.*;

//217. 存在重复元素



class Main {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet=new HashSet<>();
        for(int t:nums){
            if(hashSet.contains(t)){
                return true;
            }
            else{
                hashSet.add(t);
            }
        }
        return false;
    }
}