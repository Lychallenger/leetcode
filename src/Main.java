
import java.lang.*;
import java.util.*;

//452. 用最少数量的箭引爆气球



class Main {

    public int findMinArrowShots(int[][] points) {
       if(points.length==0) return 0;
       Arrays.sort(points, (o1, o2) -> {
           if(o1[0]!=o2[0])return o1[0]<o2[0]?-1:1;
           else {
               if(o1[1]<o2[1]){
                  return  -1;
               }
               else if(o1[1]>o2[1]){
                   return 1;
               }
               else {
                   return 0;
               }
           }
       });
       int count=1;
       int end=points[0][1];
       for(int i=1;i<points.length;i++){
           if(points[i][0]<=end){
                end=Math.min(end,points[i][1]);
           }
           else{
               count++;
           }
       }
       return count;
    }

}