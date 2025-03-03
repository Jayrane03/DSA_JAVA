package Linked_List;
import java.util.*;

public class linked_list {
    Node head;
    private  int size;

    linked_list(){
        this.size = 0;
    }

    static class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next  = null; // By default the next node for all will be null // At the start the single node will be  created not a list.



        }
    }

//    add first / addlast
  public void addFirst(String data){
      Node newNode = new Node(data);
      if(head == null){
            head = newNode;
            return;     // check whether a link list exist or not

        }
        newNode.next = head;      // newElement ->next  point to head so it will be head
        head = newNode;


  }

//  add Last
    public  void addLast(String data)
    {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;

        }
        Node currentNode = head;  // to traverse the list we have to create  a node current node and update it .
        while(currentNode.next != null){
            currentNode = currentNode.next;      // to get the last  node pointing to null and make its next to newNode

        }
        currentNode.next = newNode;

    }

//    Print the linked list
    public void printList() {
        if(head == null){
            System.out.println("List is empty ");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {

            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;

        }
        System.out.println("NULL");
    }

    public void deleteFirst(){

//        To delete the first element in the linked list we can make first.head = next ;

      if(head == null){
//          corner case

          System.out.println("The list is empty");
          return;
      }
      size--;
      head = head.next;      //make the second element as head so the first element will be removed



    }
  public void deleteLast() {
      if (head == null) {
//          corner case

          System.out.println("The list is empty");
          return;
      }
      size--;
      if (head.next == null) {
          head = null;
          return;
      }
      Node secondLast = head;   // first node
      Node lastnode  = head.next; // second node    go on till second node is null
      while(lastnode.next != null){
          lastnode = lastnode.next;
          secondLast = secondLast.next;
      }
      secondLast.next = null;
  }



    public  void reverseList(){
        if(head == null || head.next == null){
            return;
        }
        Node previousNode = head;
        Node currentNode = head.next;

        while (currentNode !=null){
            Node nextNode = currentNode.next;
            currentNode.next = previousNode;

//            update the nodes
            previousNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = previousNode;
    }

    public static void reversePrint(Node head){
        if(head == null){

            return;
        }
        reversePrint(head.next);
        System.out.print(head.data + " -> " );
    }
  public Node recursiveReverse(Node head){
        if(head == null || head.next == null) {
            return head;


        }
            Node newHead = recursiveReverse(head.next);



        head.next.next = head;
        head.next = null;

        return  newHead;

  }
    public Node mergePoint(linked_list list2) {
        Node head1 = this.head;
        Node head2 = list2.head;

        // Step 1: Calculate the lengths of both lists
        int len1 = 0, len2 = 0;
        Node temp1 = head1, temp2 = head2;

        while (temp1 != null) {
            len1++;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            len2++;
            temp2 = temp2.next;
        }

        // Step 2: Adjust the starting point of the longer list
        int diff = Math.abs(len1 - len2);

        temp1 = head1;
        temp2 = head2;

        if (len1 > len2) {
            for (int i = 0; i < diff; i++) {
                temp1 = temp1.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                temp2 = temp2.next;
            }
        }

        // Step 3: Traverse both lists together to find the merge point
        while (temp1 != null && temp2 != null) {
            if (temp1 == temp2) {
                return temp1; // Found the merge point
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }


        return null; // No merge point
    }

public  int getSize()
{
    return size;
}


    public static void  main(String[] args) {
        linked_list  list = new linked_list();
        linked_list list2 = new linked_list();
        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("x");
        list.addLast("y");
        list2.addLast("p");
        list2.addLast("q");
//        list.addLast("a");

        list.printList();
        list2.printList();
        // Creating a merge point manually by pointing the last node of list2 to a node in list1
        list2.head.next.next = list.head.next.next; // Merge at node "c"

        Node mergeNode = list.mergePoint(list2);
        if (mergeNode != null) {
            System.out.println("Merge point data: " + mergeNode.data);
        } else {
            System.out.println("No merge point found.");
        }

//        list.addFirst("is");
//        list.printList();
//
//        list.addLast("list");
//        list.printList();
//
//
//        list.addFirst("This");
//        list.printList();
//
//        list.deleteFirst();
//        list.printList();
//
//
//        list.deleteLast();
//        list.printList();
//
//
//        System.out.println(list.getSize()); //Size before adding Love at first
//        list.addFirst("Love");
//        System.out.println(list.getSize()); // Size after adding Love at the first
//        list.printList();
//
//        System.out.println();
//
//        System.out.println("Reverse the linked list ");
//        list.head =   list.recursiveReverse(list.head);
//        list.printList();
//
//        reversePrint(list.head);
//
//        list.deleteFirst();
    }
}
