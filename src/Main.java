import java.lang.*;
import java.util.*;

//387. 字符串中的第一个唯一字符



class Main {


    public int firstUniqChar(String s) {
        char []ch=s.toCharArray();
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for(int i=0;i<ch.length;i++){
            hashMap.put(ch[i],hashMap.getOrDefault(ch[i],0)+1);
        }
        for(int i=0;i<ch.length;i++){
            if(hashMap.get(ch[i])==1){
                return i;
            }
        }
        return -1;
    }
}