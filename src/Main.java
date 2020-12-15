
import com.sun.org.apache.regexp.internal.RE;
import org.omg.PortableInterceptor.INACTIVE;

import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.lang.*;
import java.util.*;

//738. 单调递增的数字



class Main {
    public int monotoneIncreasingDigits(int N) {
        String s=String.valueOf(N);
        if(s.length()==1){
            return N;
        }
        int i;
        for(i=0;i<s.length()-1;i++){
            if(s.charAt(i)<=s.charAt(i+1)){
            }
            else{
                break;
            }
        }
        if(i==s.length()-1){//全局单调递增
            return N;
        }
        else{
            String t=s.substring(0,i+1);
            //查看是否尾数有相同的
            int k;
            for(k=t.length()-1;k>0;k--){
                if(t.charAt(k)==t.charAt(k-1)){
                }
                else{
                    break;
                }
            }
            int m;
            String sb;
            StringBuilder x= new StringBuilder();
            if(k!=t.length()-1){
                sb=t.substring(0,k+1);
                k=k+1;
                for(int n=0;n<t.length()-k;n++){
                    x.append("9");
                }
                sb=String.valueOf(Integer.parseInt(sb)-1);
                String new_t=sb+x;
                m=Integer.parseInt(new_t);
            }
            else{
                m=Integer.parseInt(t);
                m=m-1;
            }

            StringBuilder other= new StringBuilder();
            for(int j=0;j<s.length()-i-1;j++){
                other.append("9");
            }
            String result=String.valueOf(m)+other;
            return Integer.parseInt(result);
        }

    }

    public static void main(String[] args) {
       int t= new Main().monotoneIncreasingDigits(332);
        System.out.println(t);
    }
}