import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//1423. 可获得的最大点数



class Main {

    public int maxScore(int[] cardPoints, int k) {
        int tmp_sum=0;
        int total=0;
        int min_sum;
        int window_size=cardPoints.length-k;
        for(int i=0;i<window_size;i++){
            tmp_sum=tmp_sum+cardPoints[i];
            total=total+cardPoints[i];
        }
        min_sum=tmp_sum;
        //slide window
        for(int i=window_size;i<cardPoints.length;i++){
            //remove left;
            tmp_sum=tmp_sum-cardPoints[i-window_size];
            //add right;
            tmp_sum=tmp_sum+cardPoints[i];
            min_sum=Math.min(min_sum,tmp_sum);
            total=total+cardPoints[i];
        }
        return total-min_sum;

    }
}