
import java.lang.*;
import java.util.*;

//1846. 减小和重新排列数组后的最大元素

class Main {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0]=1;//set to 1
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]>1){
                arr[i]=arr[i-1]+1;
            }
        }
        return arr[arr.length-1];
    }
}