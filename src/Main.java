
import com.sun.org.apache.regexp.internal.RE;
import org.omg.PortableInterceptor.INACTIVE;

import java.lang.*;
import java.util.*;

//nowcoder 机器人走方格II




class Main {

    public int countWays(int[][] map, int x, int y) {
        // write code here
        int [][]dp=new int[map.length][map[0].length];
        for(int j=0;j<y;j++){
            if(map[0][j]==1){
                dp[0][j]=1;
            }
            else{
                break;
            }
        }
        for(int i=0;i<x;i++){
            if(map[i][0]==1){
                dp[i][0]=1;
            }
            else{
                break;
            }
        }
        for(int i=1;i<x;i++){
            for(int j=1;j<y;j++){
                if(map[i][j]!=1){
                    dp[i][j]=0;
                }
                else{
                    dp[i][j]=(dp[i-1][j]+dp[i][j-1])%1000000007;
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }

}