
import com.sun.org.apache.regexp.internal.RE;
import org.omg.PortableInterceptor.INACTIVE;

import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.lang.*;
import java.util.*;

//49. 字母异位词分组



class Main {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hashtable=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String t=strs[i];
            char ss[]=t.toCharArray();
            Arrays.sort(ss);
            String key=String.valueOf(ss);
            if(hashtable.containsKey(key)){
                hashtable.get(key).add(t);
            }
            else{
                List<String> r=new ArrayList<>();
                r.add(t);
                hashtable.put(key,r);
            }
        }
        List<List<String>> result=new ArrayList<>();
        hashtable.forEach((k,v)->{
            result.add(v);
        });
        return result;
    }
}