import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//119. 杨辉三角 II



class Main {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list=new LinkedList<>();
        list.add(0,1);
        if(rowIndex==0){
            return list;
        }
        else if(rowIndex==1){
            list.add(0,1);
            return list;
        }
        else{
            list.add(0,1);
            for(int i=1;i<rowIndex;i++){
                //loop add;
                for(int j=0;j<list.size()-1;j++){
                    list.set(j,list.get(j)+list.get(j+1));
                }
                //add 1
                list.add(0,1);
            }
            return list;
        }
    }
}