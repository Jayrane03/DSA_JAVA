package Linked_List;


//check the linked list is palindrome or not

import com.sun.source.tree.WhileLoopTree;

public class hasLoopInList {
    Node head;
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
            this.next  = null;
        }

    }
    public  void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public   void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currentNode  = head;
        while (currentNode!=null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;

        }
        System.out.println("NULL");
    }
public boolean hasCycle(){
        if(head == null){
            return false;

        }
//        1 - Declare both to head   hare = 2steps and turtle  =1 step
        Node hare = head;
        Node turtle = head;

        while (hare !=null && hare.next !=null){

            hare = hare.next.next; // increase by 2 steps
            turtle  = turtle.next; // increase by one step

            if(hare == turtle){
                return true;
            }

        }
        return false;

}



    public static void main(String[] args) {

        hasLoopInList list = new hasLoopInList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(1);
//        list.addFirst(4);
//        list.isPalindrome();
        list.printList();
        list.hasCycle();

    }
}
