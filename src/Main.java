import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//547. 省份数量



class Main {

    public  void dfs(int i,int [][]isConnected,boolean[]visit){
        visit[i]=true;
        for(int j=0;j<visit.length;j++){
            if(isConnected[i][j]==1&&visit[j]==false){
                dfs(j,isConnected,visit);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        boolean [] visit=new boolean[isConnected.length];
        int count=0;
        for(int i=0;i<visit.length;i++){
            if(visit[i]==false){
                count++;
                dfs(i,isConnected,visit);
            }
        }
        return count;
    }
}