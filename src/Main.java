
import com.sun.org.apache.regexp.internal.RE;
import org.omg.PortableInterceptor.INACTIVE;

import java.io.FileReader;
import java.lang.*;
import java.util.*;

//860. 柠檬水找零



class Main {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<bills.length;i++){
            if(i==0){
                if(bills[i]==5){
                    hashMap.put(bills[i],1);
                }
                else{
                    return false;
                }
            }
            else{
                if(bills[i]==5){
                    hashMap.put(5,hashMap.getOrDefault(5,0)+1);
                }
                else if(bills[i]==10){
                    int t=hashMap.getOrDefault(5,0);
                    if(t!=0){
                        hashMap.put(5,t-1);
                        hashMap.put(10,hashMap.getOrDefault(10,0)+1);
                    }
                    else{
                        return false;
                    }
                }
                else {
                    int t1=hashMap.getOrDefault(10,0);
                    int t2=hashMap.getOrDefault(5,0);
                    if(t1!=0&&t2!=0){
                        hashMap.put(10,t1-1);
                        hashMap.put(5,t2-1);
                        hashMap.put(20,hashMap.getOrDefault(20,0)+1);
                    }
                    else if(t1==0&&t2>=3){
                        hashMap.put(5,t2-3);
                        hashMap.put(20,hashMap.getOrDefault(20,0)+1);
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
}