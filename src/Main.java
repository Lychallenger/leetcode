import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//567. 字符串的排列



class Main {

    public boolean checkInclusion(String s1, String s2) {
        int[] hashmap=new int[26];
        for(int i=0;i<s1.length();i++){
            hashmap[s1.charAt(i)-'a']++;
        }
        int left=0;
        int right=0;
        hashmap[s2.charAt(right)-'a']--;
        while(right<s2.length()){
            if(hashmap[s2.charAt(right)-'a']<0){
                hashmap[s2.charAt(left)-'a']++;
                left++;
            }
            else{
                if(right-left+1==s1.length()){
                    return true;
                }
                right++;
                if(right>=s2.length()){
                    break;
                }
                hashmap[s2.charAt(right)-'a']--;
            }

        }
        return false;
    }
}