
import com.sun.org.apache.regexp.internal.RE;
import org.omg.PortableInterceptor.INACTIVE;

import java.io.FileReader;
import java.lang.*;
import java.util.*;

//649. Dota2 参议院



class Main {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiantQueue=new ArrayDeque<>();
        Queue<Integer> direQueue=new ArrayDeque<>();
        for(int i=0;i<senate.length();i++){
            char ch=senate.charAt(i);
            if(ch=='R'){
                radiantQueue.offer(i);
            }
            else{
                direQueue.offer(i);
            }
        }
        while(!radiantQueue.isEmpty()&&!direQueue.isEmpty()){
            int radiantId=radiantQueue.poll();
            int direId=direQueue.poll();
            if(radiantId<direId){
                radiantQueue.offer(radiantId+senate.length());
            }
            else{
                direQueue.offer(direId+senate.length());
            }
        }
        if(radiantQueue.isEmpty()){
            return "Dire";
        }
        else{
            return "Radiant";
        }
    }
}