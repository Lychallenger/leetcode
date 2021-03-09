import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//1047. 删除字符串中的所有相邻重复项

class Main {
    public String removeDuplicates(String S) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<S.length();i++){
            if(st.isEmpty()){
                st.push(S.charAt(i));
            }
            else{
                if(st.peek()==S.charAt(i)){
                    st.pop();
                }
                else{
                    st.push(S.charAt(i));
                }
            }
        }
        StringBuffer sb=new StringBuffer();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}