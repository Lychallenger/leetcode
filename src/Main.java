
import java.lang.*;
import java.util.*;

//222. 完全二叉树的节点个数



class Main {

    public int countNodes(TreeNode root) {
        if(root==null)return 0;
        int max_level=0;
        TreeNode tmp=root;
        while(tmp!=null){
            max_level++;
            tmp=tmp.left;
        }
        if(max_level==1)return 1;
        else if(max_level==2) return root.right==null?2:3;
        int left=0;
        int right=(1<<(max_level-1))-1;
        while(left<right){
            int mid=left + (right - left + 1) / 2;
            if(isExist(root,mid,max_level-1)){
                left=mid;
            }
            else{
                right=mid-1;
            }
        }
        int count=(1<<(max_level-1))+left;
        return count;
    }
    public boolean isExist(TreeNode tmp,int mid,int level){
        int tag=1<<(level-1);
        while(level!=-1){
            int t=mid&tag;
            if(tmp==null)return false;
            if(t!=0){
                tmp=tmp.right;
            }
            else{
                tmp=tmp.left;
            }
            mid=(mid<<1);
            level--;
        }
        return true;
    }

}