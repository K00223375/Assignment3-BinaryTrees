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
public class Assignment3BinaryTrees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tree tree = new Tree();
        int intVal;

        System.out.println("Inserting the following values: ");

        for (int i = 1; i <= 10; i++) {
            intVal = (int) (Math.random() * 100);
            System.out.print(intVal + " ");
            tree.insertNode(intVal);
        }
        System.out.println("\n\nPreorder traversal");
        tree.preorderTraversal();

        System.out.println("\n\nInorder traversal");
        tree.inorderTraversal();

        System.out.println("\n\nPostorder traversal");
        tree.postorderTraversal();
        System.out.println();
        System.exit(0);

    }

}
