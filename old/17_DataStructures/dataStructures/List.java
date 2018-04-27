/* List.java */
// ListNode and List class defs
package dataStructures;

// Class to represent a single node in a list
class ListNode {
  // Package access members; List can access directly
  Object data; // data for this node
  ListNode nextNode;

  // Constr-- create a ListNode that refers to obj
  ListNode(Object object) {
    this(object, null);
  }

  // Constr-- create ListNode that refers to obj and next node
  ListNode(Object object, ListNode node) {
    data = object;
    nextNode = node;
  }

  // Acc
  Object getObject() { return data; }
  ListNode getNext() { return nextNode; }
}



public class List {
  private ListNode firstNode,
    lastNode;
  private String name; // e.g. "list" used for printing

  // Constr-- create empty list with name: "list"
  public List() {
    this("list");
  }

  // Constr-- create a named empty list
  public List(String listName) {
    name = listName;
    firstNode = lastNode = null;
  }

  // Determine if List is empty
  public boolean isEmpty() {
    return firstNode == null;
  }

  // Print
  public void print() {
    if (isEmpty()) {
      System.out.printf("Empty %s\n", name);
      return;
    }

    System.out.printf("The %s is: ", name);
    ListNode current = firstNode;

    // while not at end of list, output current node's data
    while (current != null) {
      System.out.printf("%s ", current.data);
      current = current.nextNode;
    }

    System.out.println("\n");
  }

  // insert at front
  public void insertAtFront(Object insertItem) {
    if (isEmpty()) {
      firstNode = lastNode = new ListNode(insertItem);
    } else {
      firstNode = new ListNode(insertItem, firstNode);
    }
  }

  // insert at back
  public void insertAtBack(Object insertItem) {
    if (isEmpty()) {
      firstNode = lastNode = new ListNode(insertItem);
    } else {
      lastNode = lastNode.nextNode = new ListNode(insertItem);
    }
  }

  // remove from front
  public Object removeFromFront() throws EmptyListException {
    if (isEmpty()) {
      throw new EmptyListException(name);
    }

    Object removedItem = firstNode.data;

    // update refs to first and last nodes
    if (firstNode == lastNode) {
      firstNode = lastNode = null;
    } else {
      firstNode = firstNode.nextNode;
    }

    return removedItem;
  }

  // remove from back
  public Object removeFromBack() throws EmptyListException {
    if (isEmpty()) {
      throw new EmptyListException(name);
    }

    Object removedItem = lastNode.data;

    // update refs to first and last nodes
    if (firstNode == lastNode) {
      firstNode = lastNode = null;
    } else {
      ListNode current = firstNode;

      // loop while current node does not ref to lastNode
      while (current.nextNode != lastNode) {
        current = current.nextNode;
      }

      lastNode = current;
      current.nextNode = null;
    }

    return removedItem;
  }

  
}
