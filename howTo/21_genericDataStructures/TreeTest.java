import java.security.SecureRandom;

import howto.datastructures.Tree;


public class TreeTest {
  public static void main(String[] args) {
    Tree<Integer> tree = new Tree<Integer>();
    SecureRandom randy = new SecureRandom();

    System.out.println("Inserting: ");
    for (int i = 1; i <= 10; i++) {
      int val = randy.nextInt(100);
      System.out.printf("%d ", val);
      tree.insertNode(val);
    }

    System.out.printf("\n\nPre-Order Traversal\n");
    tree.preorderTraversal();
    System.out.printf("\n\nIn-Order Traversal\n");
    tree.inorderTraversal();
    System.out.printf("\n\nPost-Order Traversal\n");
    tree.postorderTraversal();
    System.out.println();
  }
}
