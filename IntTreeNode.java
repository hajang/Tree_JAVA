/**
 * Created by Ha on 16. 1. 2..
 */
public class IntTreeNode extends TreeNode {
    private int value;

    public IntTreeNode(TreeNode[] children, int value){
        super(children);
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
