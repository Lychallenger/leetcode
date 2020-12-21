import java.lang.*;
import java.util.*;

//746. 使用最小花费爬楼梯



class Main {


    public int minCostClimbingStairs(int[] cost) {
        int []dp=new int[cost.length+1];
        dp[0]=cost[0];
        dp[1]=Math.min(cost[0],cost[1]);
        for(int i=2;i<dp.length;i++){
            if(i!=cost.length)
                dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
            else
                dp[i]=Math.min(dp[i-1],dp[i-2]);
        }
        return dp[dp.length-1];

    }
}