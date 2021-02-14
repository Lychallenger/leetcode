/**
 * @author ：lychallengers@gmail.com
 * @date ：2021/2/14 15:37
 */
public class UnionFind {
    private int [] parent;
    public UnionFind(int n){
        this.parent=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
    }
    public int find(int x){//路径压缩
        if(x==parent[x]){
            return x;
        }
        else{
            parent[x]=find(parent[x]);
            return parent[x];
        }
    }
    public void merge(int x,int y){
        int rootX=find(x);
        int rootY=find(y);
        if(rootX==rootY){
            return;
        }
        parent[rootX]=rootY;
    }
    public int getCount(){//返回连通分量个数
        int count=0;
        for(int i=0;i<parent.length;i++){
            if(parent[i]==i){
                count++;
            }
        }
        return count;
    }
}
