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
import javax.swing.JOptionPane;

public class Assignment3BinaryTrees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tree tree = new Tree();
        boolean brLoop = false;
        int intVal;

        while (brLoop == false) {

            String input = JOptionPane.showInputDialog("Insert Positive Int for Tree: ");
            intVal = Integer.parseInt(input);
            if (intVal<=0) {
                brLoop=true;
                System.out.println();
            } else {
                System.out.print(intVal + " ");
                tree.insertNode(intVal);
            }
        }
        
        tree.inorderTraversal();
        System.out.println();
        System.exit(0);

    }

}
