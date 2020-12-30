import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//1046. 最后一块石头的重量



class Main {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(((o1, o2) -> {
            return o2-o1;
        }));
        for(int i=0;i<stones.length;i++){
            priorityQueue.add(stones[i]);
        }
        while (priorityQueue.size()>1){
            int first=priorityQueue.poll();
            int second=priorityQueue.poll();
            if(first==second){
                continue;
            }
            else{
                priorityQueue.add(Math.abs(first-second));
            }
        }
        if(priorityQueue.size()==0){
            return 0;
        }
        else{
            return priorityQueue.poll();
        }
    }
}