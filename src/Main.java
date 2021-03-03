import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//338. 比特位计数

class Main {
    public int[] countBits(int num) {
        int [] re=new int[num+1];
        re[0]=0;
        if(num==0)return re;
        else if(num==1){
            re[1]=1;
            return re;
        }
        else{
            re[1]=1;
            for(int i=2;i<re.length;i++){
                if(i%2==0){
                    re[i]=re[i/2];
                }
                else{
                    re[i]=re[i-2]+1;
                }
            }
        }
        return re;

    }
}