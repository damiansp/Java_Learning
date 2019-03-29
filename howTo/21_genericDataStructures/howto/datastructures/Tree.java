package howto.datastructures;


class TreeNode<E extends Comparable<E>> {
  E data;
  TreeNode<E> leftNode;
  TreeNode<E> rightNode;

  
  public TreeNode(E nodeData) {
    data = nodeData;
    leftNode = rightNode = null;
  }

  
  public void insert(E insertVal) {
    if (insertVal.compareTo(data) < 0) {
      if (leftNode == null) { leftNode = new TreeNode<E>(insertVal); }
      else { leftNode.insert(insertVal); }
    } else if (insertVal.compareTo(data) > 0) {
      if (rightNode == null) { rightNode = new TreeNode<E>(insertVal); }
      else { rightNode.insert(insertVal); }
    }
  }
}



public class Tree<E extends Comparable<E>> {
  private TreeNode<E> root;

  public Tree() { root = null; }


  public void insertNode(E insertVal) {
    if (root == null) { root = new TreeNode<E>(insertVal); }
    else { root.insert(insertVal); }
  }


  public void preorderTraversal() { preorderHelper(root); }


  private void inorderHelper(TreeNode<E> node) {
    if (node == null) { return; }
    System.out.printf("%s ", node.data);
    postorderHelper(node.leftNode);
    postorderHelper(node.rightNode);
  }

  
  public void inorderTraversal() { inorderHelper(root); }


  private void postorderHelper(TreeNode<E> node) {
    if (node == null) { return; }
    inorderHelper(node.leftNode);
    System.out.printf("%s ", node.data);
    inorderHelper(node.rightNode);
  }


  public void postorderTraversal() { postorderHelper(root); }


  private void preorderHelper(TreeNode<E> node) {
    if (node == null) { return; }
    preorderHelper(node.leftNode);
    preorderHelper(node.rightNode);
    System.out.printf("%s ", node.data);
  }
}
