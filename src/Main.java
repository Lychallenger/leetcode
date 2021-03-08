import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//132. 分割回文串 II

class Main {
    public int minCut(String s) {
        boolean [][] isRe=new boolean[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            for(int j=0;j+i<s.length();j++){
                if(i==0){
                    isRe[j][j+i]=true;
                }
                else if(i==1){
                    if(s.charAt(j)==s.charAt(j+i)){
                        isRe[j][j+i]=true;
                    }
                    else{
                        isRe[j][j+i]=false;
                    }
                }
                else{
                    if(isRe[j+1][j+i-1]&&s.charAt(j)==s.charAt(j+i)){
                        isRe[j][j+i]=true;
                    }
                    else{
                        isRe[j][j+i]=false;
                    }
                }
            }
        }

        int []dp=new int[s.length()+1];
        dp[0]=0;
        for(int i=0;i<s.length();i++){
            dp[i+1]=i+1;
            for(int j=i;j>=0;j--){
                if(isRe[j][i]){
                    dp[i+1]=Math.min(dp[i+1],dp[j]+1);
                }
            }
        }
        return dp[s.length()];
    }
}