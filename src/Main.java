
import com.sun.org.apache.regexp.internal.RE;
import org.omg.PortableInterceptor.INACTIVE;

import java.lang.*;
import java.util.*;

//1672. 最富有客户的资产总量




class Main {

    public int maximumWealth(int[][] accounts) {
        int max=1;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[0].length;j++){
                sum=sum+accounts[i][j];
            }
            max=Math.max(sum,max);
        }
        return  max;
    }

}