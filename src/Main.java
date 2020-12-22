import java.lang.*;
import java.util.*;

//103. 二叉树的锯齿形层序遍历



class Main {


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue=new ArrayDeque<>();
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        queue.add(root);
        List<Integer> level0=new ArrayList<>();
        level0.add(root.val);
        int readFlag=-1;
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> tmp=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode tmpNode=queue.poll();
                if(readFlag==-1){
                    tmp.add(tmpNode.val);
                }
                else{
                    tmp.add(0,tmpNode.val);
                }
                if(tmpNode.left!=null){
                    queue.add(tmpNode.left);
                }
                if(tmpNode.right!=null){
                    queue.add(tmpNode.right);
                }
            }
            readFlag=readFlag*(-1);
            result.add(tmp);
        }
        return result;
    }
}