
import java.lang.*;
import java.util.*;

//907. 子数组的最小值之和

class pair{
    int num;
    int count;
    pair(int num,int count){
        this.num=num;
        this.count=count;
    }
}
class Main {

    public int sumSubarrayMins(int[] arr) {
        Stack<pair> st=new Stack<>();
        int sum=0;
        int res=0;
        int tmp_sum=0;
        for(int i=0;i<arr.length;i++){
            int t=arr[i];
            int ct=0;
            while(!st.isEmpty()&&st.peek().num>t){
                pair p=st.pop();
                ct=ct+p.count;
                tmp_sum=tmp_sum-p.num*p.count;
            }
            tmp_sum=tmp_sum+t*(ct+1);
            res=res+tmp_sum;
            res=res%1000000007;
            st.push(new pair(t,ct+1));
        }
        return res;
    }

}