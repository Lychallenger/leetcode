import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//435. 无重叠区间



class Main {

    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0){
            return 0;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int count=0;
        int end=intervals[0][1];
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]>=end){
                end=intervals[i][1];
                count++;
            }
        }
        return intervals.length-count;
    }
}