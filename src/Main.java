import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//331. 验证二叉树的前序序列化

class Main {
    public boolean isValidSerialization(String preorder) {
        String[] ch=preorder.split(",");
        Stack<String> st=new Stack<>();
        for(int i=0;i<ch.length;i++){
            if(!ch[i].equals("#")){
                st.push(ch[i]);
            }
            else{// ch i ==#
                if(st.isEmpty()||!st.peek().equals("#")){//st peek !=#
                    st.push(ch[i]);
                }
                else{//st peek = #
                    while(st.peek().equals("#")){
                        if(st.size()>1){
                            String t1=st.pop();
                            String t2=st.pop();
                            if(t2.equals("#")){
                                return false;
                            }
                            if(st.isEmpty()){
                                if(i==ch.length-1){
                                    return true;
                                }
                                else{
                                    return false;
                                }
                            }
                        }
                        else{
                            return false;
                        }
                    }
                    st.push("#");

                }
            }
        }
        if(st.size()==1&& st.peek().equals("#")){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(new Main().isValidSerialization("9,#,#,1"));
    }
}