
import java.lang.*;
import java.util.*;

//1030. 距离顺序排列矩阵单元格

class mat{
    int [] location;
    int dis;
    mat(int []location,int dis){
        this.location=location;
        this.dis=dis;
    }
}
class Main {

    public int getDis(int x,int y,int i,int j){
        return Math.abs(x-i)+Math.abs(y-j);
    }
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
       ArrayList<mat> arrayList=new ArrayList<>();
       for(int i=0;i<R;i++){
           for(int j=0;j<C;j++){
               int dis=getDis(i,j,r0,c0);
               arrayList.add(new mat(new int[]{i,j},dis));
           }
       }
       arrayList.sort((o1,o2)->{
           return o1.dis-o2.dis;
       });
       int [][] result=new int[arrayList.size()][2];
       for(int i=0;i<arrayList.size();i++){
           result[i]=arrayList.get(i).location;
       }
       return result;
    }

}