
import java.lang.*;
import java.util.*;

//452. 用最少数量的箭引爆气球

class loc{
    int begin;
    int end;
    loc(int begin,int end){
        this.begin=begin;
        this.end=end;
    }
}

class Main {

    public int findMinArrowShots(int[][] points) {
        List<loc> list=new ArrayList<>();
        for(int i=0;i<points.length;i++){
            list.add(new loc(points[i][0],points[i][1]));
        }
        list.sort((o1,o2)->{
            if(o1.begin!=o2.begin)return o1.begin-o2.begin;
            else return o1.end-o2.end;
        });
        List<loc> result=new ArrayList<>();
        result.add(list.get(0));
        for(int i=1;i<list.size();i++){
            int begin=list.get(i).begin;
            int end=list.get(i).end;
            int r_begin=result.get(result.size()-1).begin;
            int r_end=result.get(result.size()-1).end;
            if(begin>=r_begin&&begin<=r_end){//merge
                result.get(result.size()-1).begin=begin;
                result.get(result.size()-1).end=Math.min(r_end,end);
            }
            else{
                result.add(list.get(i));
            }
        }
        return result.size();
    }

}