
import java.lang.*;
import java.util.*;

//1122.数组的相对排序

class Main {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int []bucket=new int[1001];
        int []result=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            bucket[arr1[i]]++;
        }
        int off=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=off;j<off+bucket[arr2[i]];j++){
                result[j]=arr2[i];
            }
            off=off+bucket[arr2[i]];
            bucket[arr2[i]]=0;
        }
        for(int i=0;i<bucket.length;i++){
            if(bucket[i]!=0){
                for(int j=off;j<off+bucket[i];j++){
                    result[j]=i;
                }
                off=off+bucket[i];
            }
        }
        return result;
    }
}