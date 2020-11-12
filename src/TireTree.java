import java.util.LinkedList;

/**
 * @author ：liwan012@ke.com
 * @description：tire tree
 * @date ：2020/9/3 14:21
 */
public class TireTree {
    char content;
    LinkedList<TireTree> childList;
    boolean isEnd;
    public TireTree(char c){
        childList=new LinkedList<>();
        content=c;
        isEnd=false;
    }
    public void inverseInsert(TireTree root,String s){
        int i=0;
        boolean tag=false;
        int j=0;
        for(i=s.length()-1;i>=0;i--){
            LinkedList<TireTree> linkedList=root.childList;
            for(j=0;j<linkedList.size();j++){
                if(linkedList.get(j).content==s.charAt(i)){
                    tag=true;
                    break;
                }
            }
            if(tag){
                root=linkedList.get(j);
                tag=false;
            }
            else{
                linkedList.add(new TireTree(s.charAt(i)));
                root=linkedList.get(linkedList.size()-1);
            }
        }
    }
    public void insert(TireTree root,String s){
       int i=0;
       boolean tag=false;
       int j=0;
       for(i=0;i<s.length();i++){
        LinkedList<TireTree> linkedList=root.childList;
        for(j=0;j<linkedList.size();j++){
            if(linkedList.get(j).content==s.charAt(i)){
                tag=true;
                break;
            }
        }
        if(tag){
            root=linkedList.get(j);
            tag=false;
        }
        else{
            linkedList.add(new TireTree(s.charAt(i)));
            root=linkedList.get(linkedList.size()-1);
        }
       }
    }
}
