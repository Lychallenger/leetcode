import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//1208. 尽可能使字符串相等



class Main {

    public int equalSubstring(String s, String t, int maxCost) {
        int left=0;
        int right=0;
        int costSum=0;
        int max_len=0;
        while(right<s.length()){
            if(costSum<=maxCost){
                max_len=Math.max(max_len,right-left);
                costSum=costSum+Math.abs(s.charAt(right)-t.charAt(right));
                right++;
            }
            else{
                max_len=Math.max(max_len,right-left-1);
                costSum=costSum-Math.abs(s.charAt(left)-t.charAt(left));
                left++;
            }
        }
        if(costSum<=maxCost){
            max_len=Math.max(max_len,right-left);
        }
        return max_len;
    }
}