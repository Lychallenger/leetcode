
import java.lang.*;
import java.util.*;

//275. H 指数 II

class Main {
    public int hIndex(int[] citations) {
        int N = citations.length;
        int left = 0;
        int right = N-1;

        while (left <= right) {
            int mid = (left+right)/ 2;
            int data = citations[mid];
            if(data>N-mid){//to left
                right=mid-1;
            }
            else if(data<N-mid){//to right
                left=mid+1;
            }
            else{
                return data;
            }
        }
        return N-left;
    }
}