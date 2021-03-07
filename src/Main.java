import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//131. 分割回文串

class Main {
    public void dfs(String s,int off,boolean[][]dp,List<String> tmp,List<List<String>> re){
        if(off==s.length()){
            re.add(new ArrayList<>(tmp));
            return;
        }
        for(int i=off;i<s.length();i++){
            if(dp[off][i]){
                tmp.add(s.substring(off,i+1));
                dfs(s,i+1,dp,tmp,re);
                tmp.remove(tmp.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        boolean [][] dp=new boolean[s.length()][s.length()];
        for(int step=0;step<s.length();step++){
            for(int i=0;i+step<s.length();i++){
                if(step==0){
                    dp[i][i+step]=true;
                }
                else if(step==1){
                    if(s.charAt(i)==s.charAt(i+step)){
                        dp[i][i+step]=true;
                    }
                    else{
                        dp[i][i+step]=false;
                    }
                }
                else{
                    if(s.charAt(i)==s.charAt(i+step) && dp[i+1][i+step-1]){
                        dp[i][i+step]=true;
                    }
                    else{
                        dp[i][i+step]=false;
                    }
                }
            }
        }
        List<String> tmp=new ArrayList<>();
        List<List<String>> re=new ArrayList<>();
        dfs(s,0,dp,tmp,re);
        return re;

    }
}