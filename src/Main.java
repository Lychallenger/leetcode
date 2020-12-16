import java.lang.*;
import java.util.*;

//290. 单词规律



class Main {
    public boolean wordPattern(String pattern, String s) {
        String [] str=s.split("\\s+");
        if(str.length!=pattern.length()){
            return false;
        }
        HashMap<Character, String> chHashMap=new HashMap<>();
        HashMap<String,Character> strHashMap=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(chHashMap.containsKey(ch)){
                String tmp=chHashMap.get(ch);
                if(tmp.equals(str[i])){
                    continue;
                }
                else{
                    return false;
                }
            }
            else{
                if(strHashMap.containsKey(str[i])){
                    char tp=strHashMap.get(str[i]);
                    if(tp!=ch){
                        return false;
                    }
                    else{
                        continue;
                    }
                }
                else{
                    strHashMap.put(str[i],ch);
                    chHashMap.put(ch,str[i]);
                }
            }
        }
        return true;

    }
}