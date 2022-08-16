import java.util.Hashtable;
import java.util.Vector;

public class DataStructures {
    public static void main(String[] args) {
        /*
         * Data Structure: Aggregation of atomic and composite data types
         * into a set of well-defined relationships.
         * A structure is a set of rules that holds the data together.
         */

        // ADT : Abtract Data Type
        // Vector class
        Vector vector = new Vector<String>(10, 5);
        vector.add("Hello");
        vector.insertElementAt("World", 1);
        vector.remove("Hello");
        System.out.println(vector.elementAt(0));

        /*
         * Vector vs ArrayList
         * Vector is syncronized and arrayList don't
         * Vector increments twice the matrix value (10 goes to 20)
         * ArrayList is faster
         * ArrayList uses iterator and Vecor uses enum
         */

        /*
         * Linked Lists: sequential structure that consists of a sequence of 
         * items in linear order which are linked to each other.
         * Singly linked lists: can be done in the forward direction only (isn't sorted).
         * Sorted linked lists: an be done in the forward direction only (is sorted lower to greater)
         * Doubly linked lists: can be done in both forward and backward directions. Nodes consist of 
         * an additional pointer known as prev, pointing to the previous node.
         * Circular linked lists: Linked lists where the prev pointer of the head points to the tail and 
         * the next pointer of the tail points to the head.
         */

        // Singly linked lists
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addLast(4);
        linkedList.addLast(5);
        
        // linkedList.show();

        linkedList.delete(5);
        // linkedList.show();
        
        // Sorted Linked List
        SortedLinkedList sortedList = new SortedLinkedList();
        sortedList.insertSorted(4);
        sortedList.insertSorted(8);
        sortedList.insertSorted(2);
        sortedList.insertSorted(3);

        sortedList.show();

        // Double Linked List
        DoubleLinkedList doubleList = new DoubleLinkedList();
        doubleList.add(1);
        doubleList.add(2);
        doubleList.add(3);
        doubleList.add(4);
        doubleList.addFirst(5);
        doubleList.addFirst(6);

        doubleList.show();

        // Circular linked lists (no elimina)
        CircularLinkedList circularList = new CircularLinkedList();
        circularList.add(1);
        circularList.add(2);
        circularList.add(8);
        circularList.add(9);
    
        circularList.show();

        /*
         * Stacks: Is a LIFO (Last In First Out) structure. It has 2 basic
         * operations, push and pop.
         */

        Stack stack = new Stack();
        stack.push(2);
        stack.push(5);
        stack.push(0);
        stack.show();

        /*
         * Queues: Is a FIFO (First In First Out) structure. It has 2 basic 
         * operations, enqueue and dequeue.
         */

        Queue queue = new Queue();
        queue.enqueue(1); 
        queue.enqueue(2); 
        queue.enqueue(3); 
        queue.enqueue(4); 

        queue.show();

        /*
         * Hash Tables:  data structure that stores values which have keys associated 
         * with each of them. Furthermore, it supports lookup efficiently if we know 
         * the key associated with the value.
         */

        Hashtable <String, String> table = new Hashtable<String, String>();
        table.put("Daniela", "Mexican");
        table.put("Jose", "American");
        table.put("Ana", "Russian");

        System.out.println(table.get("Jose"));

        /*
         * Trees: hierarchical structure where data is organized 
         * hierarchically and are linked together.  
         * BST: Binary Search Tree, data is organized in a hierarchical structure. 
         * This data structure stores values in sorted order.
         * Heap:  is a special case of a binary tree where the parent nodes are compared 
         * to their children with their values and are arranged accordingly.
         */

         BinaryTree tree = new BinaryTree();
         tree.add(2);
         tree.add(1);
         tree.add(15);
         tree.add(17);
         tree.add(4);
    }
}