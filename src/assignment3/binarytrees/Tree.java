/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3.binarytrees;

/**
 *
 * @author k00223375
 */
public class Tree {

    private TreeNode root;

    String answer="";
    // Construct an empty Tree of integers
    public Tree() {
        root = null;
    }

    // Insert a new node in the binary search tree. If the root node is null, create the    
    // root node here. Otherwise, call the insert method of class TreeNode.
    public synchronized void insertNode(int d) {
        if (root == null) {
            root = new TreeNode(d);
        } else {
            root.insert(d);
        }
    }

    public synchronized void inorderTraversal() {
        inorderHelper(root);
        System.out.println(answer);
    }

    // Recursive method to perform inorder traversal
    private void inorderHelper(TreeNode node) {
        if (node == null) {
            return;
        }
        inorderHelper(node.left);
        //System.out.print(node.data + " ");
        checkBranch(node);
        inorderHelper(node.right);
        
    }
    
    private void checkBranch(TreeNode node)
    {
        if(node.left == null && node.right == null)
        {
            answer += node.data +": is a Leaf \n";
        }
        else if (node.left == null && node.right != null)
        {
            answer += node.data +": Right Subtree: " + node.right.data +"\n";
        }
        else if (node.left != null && node.right == null)
        {
            answer += node.data +": Left Subtree: " + node.left.data +"\n";
        }
        else
        {
            answer += node.data +": Left Subtree " + node.left.data + " Right Subtree: " + node.right.data +"\n";
        }
        
    }
    
    
}
