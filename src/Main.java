
import java.lang.*;
import java.util.*;

//1370. 上升下降字符串



class Main {

    public String sortString(String s) {
        String table="abcdefghijklmnopqrstuvwxyz";
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for(int i=0;i<table.length();i++){
            hashMap.put(table.charAt(i),0);
        }
        for(int i=0;i<s.length();i++){
            hashMap.put(s.charAt(i),hashMap.getOrDefault(s.charAt(i),0)+1);
        }
        int count=0;
        int tag=-1;
        StringBuffer result=new StringBuffer();
        while(count<s.length()){
            int ct=0;
            if(tag==-1){//正向
                for(int i=0;i<table.length();i++){
                    if(hashMap.get(table.charAt(i))!=0){
                        ct++;
                        result.append(table.charAt(i));
                        hashMap.put(table.charAt(i),hashMap.get(table.charAt(i))-1);
                    }
                }
            }
            else{//反向
                for(int i=table.length()-1;i>=0;i--){
                    if(hashMap.get(table.charAt(i))!=0){
                        ct++;
                        result.append(table.charAt(i));
                        hashMap.put(table.charAt(i),hashMap.get(table.charAt(i))-1);
                    }
                }
            }
            count=count+ct;
            tag=tag*(-1);
        }
        return  result.toString();
    }

}