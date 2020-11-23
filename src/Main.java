
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
       List<int []> list=new ArrayList<>();
       list.add(points[0]);
       for(int i=1;i<points.length;i++){
           int begin=points[i][0];
           int end=points[i][1];
           int r_begin=list.get(list.size()-1)[0];
           int r_end=list.get(list.size()-1)[1];
           if(begin>=r_begin&&begin<=r_end){
               list.get(list.size()-1)[0]=begin;
               list.get(list.size()-1)[1]=Math.min(end,r_end);
           }
           else{
               list.add(points[i]);
           }
       }
       return list.size();
    }

}