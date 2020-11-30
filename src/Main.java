
import com.sun.org.apache.regexp.internal.RE;
import org.omg.PortableInterceptor.INACTIVE;

import java.lang.*;
import java.util.*;

//767. 重构字符串


class letter{
    char ch;
    int count;
    letter(char ch,int count){
        this.ch=ch;
        this.count=count;
    }
}

class Main {

    public String reorganizeString(String S) {
        PriorityQueue<letter> priorityQueue=new PriorityQueue<>(26,((o1, o2) ->{
            return o2.count-o1.count;
        }));
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for(int i=0;i<S.length();i++){
            hashMap.put(S.charAt(i),hashMap.getOrDefault(S.charAt(i),0)+1);
        }
        hashMap.forEach((k,v)->{
            priorityQueue.add(new letter(k,v));
        });
        StringBuffer sb=new StringBuffer();
        while(priorityQueue.size()>1){
            letter l1=priorityQueue.poll();
            letter l2=priorityQueue.poll();
            l1.count--;
            if(l1.count>0)priorityQueue.add(l1);
            l2.count--;
            if(l2.count>0)priorityQueue.add(l2);
            sb.append(l1.ch);
            sb.append(l2.ch);
        }
        if(priorityQueue.size()!=0){
            letter l=priorityQueue.poll();
            if(l.count!=1)return "";
            sb.append(l.ch);
        }
        return sb.toString();
    }

}