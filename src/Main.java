import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//424. 替换后的最长重复字符



class Main {

    public int characterReplacement(String s, int k) {
        int [] table=new int[26];
        int left=0;
        int right=0;
        int result=0;
        while(right<s.length()){
            table[s.charAt(right)-'A']++;
            result=Math.max(result,table[s.charAt(right)-'A']);
            if(right-left+1-result>k){
                table[s.charAt(left)-'A']--;
                left++;
            }
            right++;
        }
        return right-left;
    }
}