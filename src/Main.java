import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//978. 最长湍流子数组



class Main {

    public int maxTurbulenceSize(int[] arr) {
        if(arr.length<2){
            return arr.length;
        }
        int max_len=1;
        int tmp_len=1;
        for(int i=0;i<arr.length-1;i++){
            if(i%2==0){
                if(arr[i]>arr[i+1]){
                    tmp_len++;
                }
                else{
                    tmp_len=1;
                }
            }
            else{
                if(arr[i]<arr[i+1]){
                    tmp_len++;
                }
                else{
                    tmp_len=1;
                }
            }
            max_len=Math.max(max_len,tmp_len);
        }
        int len_tmp=1;
        for(int i=0;i<arr.length-1;i++){
            if(i%2==1){
                if(arr[i]>arr[i+1]){
                    len_tmp++;
                }
                else{
                    len_tmp=1;
                }
            }
            else{
                if(arr[i]<arr[i+1]){
                    len_tmp++;
                }
                else{
                    len_tmp=1;
                }
            }
            max_len=Math.max(max_len,len_tmp);
        }
        return max_len;
    }
}