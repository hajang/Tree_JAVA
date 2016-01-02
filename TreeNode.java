/**
 * Created by Ha on 16. 1. 2..
 */
public abstract class TreeNode {
    private TreeNode[] children;

    public TreeNode(TreeNode[] children){
        this.children = children;
    }

    public TreeNode[] getChildren(){
        return children;
    }

    public int getNumofChildren(){
        return children.length;
    }

    public TreeNode getChildAt(int index){
        return children[index];
    }
}

