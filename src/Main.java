
import java.lang.*;
import java.util.*;

//402.移除k位数字

class Main {

    public String removeKdigits(String num, int k) {
        if(num.length()==k){
            return "0";
        }
        int i,j;
        for(i=0;i<k;i++){
            boolean tag=false;
            for(j=0;j<num.length()-1;j++){
                if(num.charAt(j)> num.charAt(j+1)){
                    num=num.substring(0,j)+num.substring(j+1);
                    tag=true;
                    break;
                }
            }
            if(!tag){
                num=num.substring(0,num.length()-1);
            }
            int off=0;
            for(j=0;j<num.length();j++){
                if(num.charAt(j)=='0'){
                    off++;
                }
                else{
                    break;
                }
            }
            num=num.substring(off);
        }
        int off=0;
        for(j=0;j<num.length();j++){
            if(num.charAt(j)=='0'){
                off++;
            }
            else{
                break;
            }
        }
        num=num.substring(off);
        if(num.length()==0){
            return "0";
        }
        else{
            return num;
        }
    }

}