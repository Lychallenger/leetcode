
import java.lang.*;
import java.util.*;

//1122.数组的相对排序

class Main {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i=0;i<arr2.length;i++){
            hashSet.add(arr2[i]);
        }
        int []result=new int[arr1.length];
        HashMap<Integer,Integer>  hashMap=new HashMap<>();
        int ct=0;
        for(int i=0;i<arr1.length;i++){
            if(hashSet.contains(arr1[i])){
                hashMap.put(arr1[i],hashMap.getOrDefault(arr1[i],0)+1);
            }
            else{
                ct++;
            }
        }
        int off=0;
        for(int i=0;i<arr2.length;i++){
            int value=hashMap.get(arr2[i]);
            for(int j=off;j<off+value;j++){
                result[j]=arr2[i];
            }
            off=off+value;
        }
        for(int i=0;i<arr1.length;i++){
            if(!hashSet.contains(arr1[i])){
                result[off]=arr1[i];
                off++;
            }
        }
        return result;
    }
}