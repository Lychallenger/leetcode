
import java.lang.*;
import java.util.*;

//1642. 可以到达的最远建筑

class Main {
   public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> priorityQueue =new PriorityQueue<>((o1,o2)->o1-o2);
        for(int i=0;i<heights.length-1;i++){
            if(heights[i]<heights[i+1]){
                priorityQueue.add(heights[i+1]-heights[i]);
                if(priorityQueue.size()>ladders){
                    bricks=bricks-priorityQueue.poll();
                }
                if(bricks<0){
                    return i;
                }
            }
        }
        return heights.length-1;
    }
}
