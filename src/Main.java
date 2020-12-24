import java.lang.*;
import java.util.*;

//135. 分发糖果



class Main {


    public int candy(int[] ratings) {
        int []dp=new int[ratings.length];
        dp[0]=1;
        for(int i=0;i<ratings.length-1;i++){
            if(ratings[i]<ratings[i+1]){
                dp[i+1]=dp[i]+1;
            }
            else{
                dp[i+1]=1;
            }
        }
        int sum=0;
        for(int i=ratings.length-1;i>0;i--){
            if(ratings[i-1]>ratings[i]){
                dp[i-1]=Math.max(dp[i-1],dp[i]+1);
            }
            sum=sum+dp[i-1];
        }
        sum=sum+dp[dp.length-1];
        return sum;
    }
}