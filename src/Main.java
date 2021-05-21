
import java.lang.*;
import java.util.*;

//1035. 不相交的线

class Main {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
            int [][] dp=new int[nums1.length+1][nums2.length+1];
            int max_len=0;
            for(int i=0;i<dp.length;i++){
                for(int j=0;j<dp[0].length;j++){
                    if(i==0||j==0){
                        dp[i][j]=0;
                    }
                    else{
                        if(nums1[i-1]==nums2[j-1]){
                            dp[i][j]=dp[i-1][j-1]+1;
                        }
                        else{
                            dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                        }
                        max_len=Math.max(dp[i][j],max_len);
                    }
                }
            }
            return max_len;
    }

    public static void main(String[] args) {
        int []nums1={1,3,7,1,7,5};
        int []nums2={1,9,2,5,1};
        new Main().maxUncrossedLines(nums1,nums2);
    }
}