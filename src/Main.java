import java.lang.*;
import java.util.*;

//205. 同构字符串



class Main {

    public boolean isIsomorphic(String s, String t) {
      if(s.length()!=t.length()){
          return false;
      }
      else{
          HashMap<Character,Character> hashMap=new HashMap<>();
          HashSet<Character> result=new HashSet<>();
          for(int i=0;i<s.length();i++){
              if(hashMap.containsKey(s.charAt(i))){
                  if(hashMap.get(s.charAt(i))!=t.charAt(i)){
                      return false;
                  }
              }
              else{
                  if(result.contains(t.charAt(i))){
                      return false;
                  }
                  hashMap.put(s.charAt(i),t.charAt(i));
                  result.add(t.charAt(i));
              }
          }
          return true;
      }
    }
}