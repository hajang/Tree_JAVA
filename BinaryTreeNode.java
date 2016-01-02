/**
 * Created by Ha on 16. 1. 2..
 */
public class BinaryTreeNode {
    private BinaryTreeNode left;
    private BinaryTreeNode right;
    private int value;

    // default constructor
    public BinaryTreeNode(){
        left = null;
        right = null;
        value = -1;
    }

    // constructor with value
    public BinaryTreeNode(int value){
        left = null;
        right = null;
        this.value = value;
    }

    // constructor with left, right children and value
    public BinaryTreeNode(BinaryTreeNode left, BinaryTreeNode right, int value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public BinaryTreeNode getLeft(){
        return left;
    }

    public BinaryTreeNode getRight(){
        return right;
    }

    public int getValue(){
        return value;
    }

    public void setLeft(BinaryTreeNode left){
        this.left = left;
    }

    public void setRight(BinaryTreeNode right){
        this.right = right;
    }

    public void setValue(int value){
        this.value = value;
    }

    // returns node with value in a tree
    // processed recursively
    public static BinaryTreeNode findNode(BinaryTreeNode root, int value){
        while(root != null){
            if(root.value == value)
                return root;
            else if(root.value > value)
                return findNode(root.left, value);
            else
                return findNode(root.right, value);
        }

        // not found
        return null;
    }
}
