
import java.lang.*;
import java.util.*;

//692. 前K个高频单词

class Main {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        for(int i=0;i<words.length;i++){
            hashMap.put(words[i],hashMap.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<Map.Entry<String, Integer>> priorityQueue = new PriorityQueue<>(
                (o1, o2) ->{
                    if(o1.getValue().equals(o2.getValue())){
                        return o1.getKey().compareTo(o2.getKey());
                    }
                    else{
                        return o1.getValue()-o2.getValue();
                    }
                } );
        for(Map.Entry<String,Integer> entry:hashMap.entrySet()){
            if(priorityQueue.size()<k){
                priorityQueue.add(entry);
            }
            else{
                if(entry.getValue()>priorityQueue.peek().getValue()||
                        (entry.getValue().equals(priorityQueue.peek().getValue())
                                &&entry.getKey().compareTo(priorityQueue.peek().getKey())<0)){
                    priorityQueue.poll();
                    priorityQueue.add(entry);
                }
            }
        }
        List<String> list=new ArrayList<>();
        for(int i=0;i<k;i++){
            list.add(0,priorityQueue.poll().getKey());
        }
        return list;
    }

}