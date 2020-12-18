import java.lang.*;
import java.util.*;

//389. 找不同



class Main {


    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hashMap.put(s.charAt(i),hashMap.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            if(hashMap.containsKey(t.charAt(i))){
                int count=hashMap.get(t.charAt(i));
                if(count==0){
                    return t.charAt(i);
                }
                else{
                    hashMap.put(t.charAt(i),count-1);
                }
            }
            else{
                return t.charAt(i);
            }
        }
        return 'a';
    }
}