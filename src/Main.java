
import java.lang.*;
import java.util.*;

//222. 完全二叉树的节点个数



class Main {

    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        else{
            return 1+countNodes(root.left)+countNodes(root.right);
        }
    }

}