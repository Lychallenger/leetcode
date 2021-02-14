import sun.nio.cs.ext.MacHebrew;

import java.lang.*;
import java.util.*;

//765. 情侣牵手


class Main {
    public int minSwapsCouples(int[] row) {
        int count=row.length/2;
        UnionFind unionFind=new UnionFind(count);
        for(int i=0;i<row.length-1;i=i+2){
            unionFind.merge(row[i]/2,row[i+1]/2);
        }
        return count-unionFind.getCount();
    }
}