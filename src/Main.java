
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
       ArrayList<man> result=new ArrayList<>();
        for(int i=arrayList.size()-1;i>=0;i--){
            result.add(arrayList.get(i).k,arrayList.get(i));
        }

        for(int i=0;i<result.size();i++){
            int h=result.get(i).h;
            int k=result.get(i).k;
            people[i][0]=h;
            people[i][1]=k;
        }
        return people;

    }

    public static void main(String[] args) {
        int [][]arr=new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        new Main().reconstructQueue(arr);
    }

}