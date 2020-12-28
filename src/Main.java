import java.lang.*;
import java.util.*;

//188. 买卖股票的最佳时机 IV



class Main {

    public int maxProfit(int k, int[] prices) {

        if(k>=prices.length/2){
            int sum=0;
            for(int i=1;i<prices.length;i++){
                if(prices[i]>prices[i-1]){
                    sum=sum+prices[i]-prices[i-1];
                }
            }
            return sum;
        }
        int [][][]dp=new int[prices.length+1][k+1][2];
        //初始值
        for(int i=0;i<prices.length+1;i++){
            dp[i][0][0]=0;
            dp[i][0][1]=Integer.MIN_VALUE;
        }
        for(int i=0;i<=k;i++){
            dp[0][i][0]=0;
            dp[0][i][1]=-prices[0];
        }
        for(int i=1;i<=prices.length;i++){
            for(int j=1;j<=k;j++){
                dp[i][j][0]=Math.max(dp[i-1][j][0],dp[i-1][j][1]+prices[i-1]);
                dp[i][j][1]=Math.max(dp[i-1][j][1],dp[i-1][j-1][0]-prices[i-1]);
            }
        }
        return dp[prices.length][k][0];
    }
}