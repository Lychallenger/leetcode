import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//354. 俄罗斯套娃信封问题

class Main {
    public int maxEnvelopes(int[][] envelopes) {
        if(envelopes.length==0){
            return 0;
        }
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]!=o2[0]){
                    return o1[0]-o2[0];
                }
                else{
                    return o2[1]-o1[1];
                }
            }
        });
        int max=1;
        int []dp=new int[envelopes.length];
        Arrays.fill(dp,1);
        for(int i=1;i<envelopes.length;i++){
            for(int j=0;j<i;j++){
                if(envelopes[i][1]>envelopes[j][1]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}