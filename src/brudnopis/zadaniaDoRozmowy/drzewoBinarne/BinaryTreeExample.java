package rekru.rozmowy.NokiaJavaFullstackWorkingStudent.zadaniaDoRozmowy.drzewoBinarne;

import rekru.rozmowy.NokiaJavaFullstackWorkingStudent.zadaniaDoRozmowy.drzewoBinarne.BinaryTree;

public class BinaryTreeExample {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(6);
        tree.add(4);
        tree.add(8);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);

        System.out.println("In Order Traversal");
        tree.traverseInOrder(tree.root);
        System.out.println("\nPre Order Traversal");
        tree.traversePreOrder(tree.root);
        System.out.println("\nPost Order Traversal");
        tree.traversePostOrder(tree.root);
        System.out.println("\nLevel Order Traversal");
        tree.traverseLevelOrder();
    }
}
