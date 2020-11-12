import java.util.List;

/**
 * @author ：liwan012@ke.com
 * @description：
 * @date ：2020/10/15 8:51
 */
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
