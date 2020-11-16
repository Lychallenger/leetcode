
import java.lang.*;
import java.util.*;

//406. 根据身高重建队列

class man{
    int h;
    int k;
    man(int h,int k){
        this.h=h;
        this.k=k;
    }
}
class Main {

    public int[][] reconstructQueue(int[][] people) {
        ArrayList<man> arrayList=new ArrayList<>();
        for(int i=0;i<people.length;i++){
            arrayList.add(new man(people[i][0],people[i][1]));
        }
        arrayList.sort((o1,o2)->{
            if(o1.h!=o2.h){
                return o1.h-o2.h;
            }
            else{
                return o2.k-o1.k;
            }
        });
        boolean []visit=new boolean[people.length];
        for(int i=0;i<arrayList.size();i++){
            int h=arrayList.get(i).h;
            int k=arrayList.get(i).k;
            int off=0;
            for(int j=0;j<visit.length;j++){
                if(visit[j]==false){
                    if(off==k){
                        people[j][0]=h;
                        people[j][1]=k;
                        visit[j]=true;
                        break;
                    }
                    off++;
                }

            }

        }
        return people;

    }

    public static void main(String[] args) {
        int [][]arr=new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        new Main().reconstructQueue(arr);
    }

}