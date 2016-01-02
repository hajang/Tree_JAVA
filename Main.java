/**
 * Created by Ha on 16. 1. 2..
 */

public class Main {

    // BST simulation
    public static void main(String[] args) {

        /*
            make a BST  
                        5
                       / \
                      3   6
                     / \   \
                    1   4   7
         */

        BinaryTreeNode node1 = new BinaryTreeNode(1);
        BinaryTreeNode node3 = new BinaryTreeNode(3);
        BinaryTreeNode node4 = new BinaryTreeNode(4);
        BinaryTreeNode node5 = new BinaryTreeNode(5);
        BinaryTreeNode node6 = new BinaryTreeNode(6);
        BinaryTreeNode node7 = new BinaryTreeNode(7);

        node5.setLeft(node3);
        node5.setRight(node6);
        node6.setRight(node7);
        node3.setLeft(node1);
        node3.setRight(node4);


        // perform BST recursive method findNode - look for 4
        BinaryTreeNode node = BinaryTreeNode.findNode(node5, 4);
        if(node != null) // if found
            System.out.println(node.getValue());
        else
            System.out.println("node not found");

    }

}
