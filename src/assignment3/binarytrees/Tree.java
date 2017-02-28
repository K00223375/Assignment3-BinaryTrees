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

    public synchronized void preorderTraversal() {
        preorderHelper(root);
    }

    // Recursive method to perform preorder traversal
    private void preorderHelper(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorderHelper(node.left);
        preorderHelper(node.right);
    }

    public synchronized void inorderTraversal() {
        inorderHelper(root);
    }

    // Recursive method to perform inorder traversal
    private void inorderHelper(TreeNode node) {
        if (node == null) {
            return;
        }
        inorderHelper(node.left);
        System.out.print(node.data + " ");
        inorderHelper(node.right);
    }

    public synchronized void postorderTraversal() {
        postorderHelper(root);
    }

    // Recursive method to perform postorder traversal
    private void postorderHelper(TreeNode node) {
        if (node == null) {
            return;
        }
        postorderHelper(node.left);
        postorderHelper(node.right);
        System.out.print(node.data + " ");
    }

}
