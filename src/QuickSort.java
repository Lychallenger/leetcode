/**
 * @author ：liwan012@ke.com
 * @description：quick sort
 * @date ：2020/9/7 10:37
 */
public class QuickSort {
    public static int partition(int []arr,int low,int high){
        int pivot=arr[low];
        while(low<high){
            while(low<high&&arr[high]>pivot)high--;
            arr[low]=arr[high];
            while(low<high&&arr[low]<=pivot)low++;
            arr[high]=arr[low];
        }
        arr[low]=pivot;
        return low;
    }
    public  static  void quick_sort(int []arr,int low,int high){
        if(low<high){
            int p=partition(arr,low,high);
            quick_sort(arr,low,p-1);
            quick_sort(arr,p+1,high);
        }
    }
}
