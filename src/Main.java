
import com.sun.org.apache.regexp.internal.RE;
import org.omg.PortableInterceptor.INACTIVE;

import java.io.FileReader;
import java.lang.*;
import java.util.*;

//842. 将数组拆分成斐波那契序列




class Main {
    public boolean tag=false;
    public List<Integer> result=new ArrayList<>();
    public boolean isSplit(String s){
        if(s.length()>1&&s.charAt(0)=='0'){
            return false;
        }
        else if(s.length()>String.valueOf(Integer.MAX_VALUE).length()){
            return false;
        }
        else if(s.length()==String.valueOf(Integer.MAX_VALUE).length()&&s.compareTo(String.valueOf(Integer.MAX_VALUE))>0){
            return false;
        }
        else{
            return true;
        }
    }
    public void dfs(String s,List<Integer> list){
        if(s.length()==0|| tag){
            if(list.size()>2){
                tag=true;
                for(int i=0;i<list.size();i++){
                    result.add(list.get(i));
                }
            }
        }
        else{
            if(list.size()<2){
                for(int i=0;i<s.length();i++){
                    String tmp=s.substring(0,i+1);
                    if(isSplit(tmp)){
                        int t=Integer.parseInt(tmp);
                        list.add(t);
                        dfs(s.substring(i+1),list);
                        list.remove(list.size()-1);
                    }

                }
            }
            else{
                for(int i=0;i<s.length();i++){
                    String tmp=s.substring(0,i+1);
                    if(isSplit(tmp)){
                        int t=Integer.parseInt(tmp);
                        if(t==list.get(list.size()-2)+list.get(list.size()-1)){
                            list.add(t);
                            dfs(s.substring(i+1),list);
                            list.remove(list.size()-1);
                        }
                        else{
                            if(i==s.length()-1)return;
                        }
                    }

                }
            }
        }
    }
    public List<Integer> splitIntoFibonacci(String S) {
        List<Integer> list=new ArrayList<>();
        if(S.length()==1&&S.charAt(0)=='0'){
            list.add(0);
            return list;
        }
        else{
            dfs(S, list);
            if(tag){
                return result;
            }
            else{
                return new ArrayList<>();
            }
        }
       
    }

    public static void main(String[] args) {
       List<Integer> t= new Main().splitIntoFibonacci("214748364721474836422147483641");
        System.out.println(t);
    }

}