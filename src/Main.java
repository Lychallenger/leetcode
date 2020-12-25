import java.lang.*;
import java.util.*;

//455. 分发饼干



class Main {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ct=0;
        int count=0;
        for(int i=0;i<s.length;i++){
            if(ct<g.length&&s[i]>=g[ct]){
                count++;
                ct++;
            }
            else {
                continue;
            }
        }
        return count;
    }
}