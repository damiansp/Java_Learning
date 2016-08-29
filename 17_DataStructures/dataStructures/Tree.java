/* Tree.java */
package dataStructures;

class TreeNode {
  // Package-access members
  TreeNode leftNode,
    rightNode;
  int datum;

  // Constr (init data; node as leaf node)
  public TreeNode(int nodeDatum) {
    datum = nodeDatum;
    leftNode = rightNode = null;
  }

  // Locate insertion point, insert new node; ignore duplicates
  public void insert(int insertValue) {
    // Insert in left subtree...
    if (insertValue < datum) {
      // Insert new TreeNode
      if (leftNode == null) {
        leftNode = new TreeNode(insertValue);
      } else {
        // Continue traversing left subtree
        leftNode.insert(insertValue);
      }
    } else if (insertValue > datum) {
      // ...in right subtree
      // New node
      if (rightNode == null) {
        rightNode = new TreeNode(insertValue);
      } else {
        // Continue traversing right subtree
        rightNode.insert(insertValue);
      }
    }
  }
}


public class Tree {
  private TreeNode root;

  // Constr (init empty tree of ints)
  public Tree() {
    root = null;
  }

  // Insert new node in binary search tree
  public void insertNode(int insertValue) {
    if (root == null) {
      root = new TreeNode(insertValue);
    } else {
      root.insert(insertValue);
    }
  }

  // Preorder Helper: recursive method to perform preorder traversal
  private void preorderHelper(TreeNode node) {
    if (node == null) { return; }
    System.out.printf("%d ", node.datum);
    preorderHelper(node.leftNode);
    preorderHelper(node.rightNode);
  }
  
  // Preorder traversal
  public void preorderTraversal() {
    preorderHelper(root);
  }

  // Inorder Helper
  private void inorderHelper(TreeNode node) {
    if (node == null) { return; }
    inorderHelper(node.leftNode);
    System.out.printf("%d ", node.datum);
    inorderHelper(node.rightNode);
  }

  // Inorder traversal
  public void inorderTraversal() {
    inorderHelper(root);
  }

  // Postorder Helper
  private void postorderHelper(TreeNode node) {
    if (node == null) { return; }
    postorderHelper(node.leftNode);
    postorderHelper(node.rightNode);
    System.out.printf("%d ", node.datum);
  }

  // Postorder Traversal
  public void postorderTraversal() {
    postorderHelper(root);
  }
}
  
