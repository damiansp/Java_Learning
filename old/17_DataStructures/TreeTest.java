/* TreeTest.java */
import java.util.Random;
import dataStructures.Tree;

public class TreeTest {
  public static void main(String[] args) {
    Random rand = new Random();
    Tree tree = new Tree();
    int value;

    System.out.println("Inserting the following values: ");

    // Insert 10 rand ints on [0, 99] into Tree
    for (int i = 1; i <= 10; i++) {
      value = rand.nextInt(100);
      System.out.print(value + " ");
      tree.insertNode(value);
    }

    System.out.println("\n\nPreorder Traversal:");
    tree.preorderTraversal();
    System.out.println("\n\nInorder Traversal:");
    tree.inorderTraversal();
    System.out.println("\n\nPostorder Traversal:");
    tree.postorderTraversal();
    System.out.println();
  }
}
