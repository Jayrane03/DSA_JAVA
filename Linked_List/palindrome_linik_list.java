package Linked_List;


//check the linked list is palindrome or not

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class palindrome_linik_list {
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

    public  Node reverse(Node head){
        Node prev = null;
        Node current = head;

        while (current!=null){
            Node next = current.next;
            current.next = prev;
            prev  = current;
            current = next;

        }
        return  prev;

    }

    public  Node findMiddle(Node head){
       Node hare = head;
       Node turtle = head;

       while (hare.next !=null && hare.next.next !=null){
           hare = hare.next.next;
           turtle = turtle.next;
       }
       return turtle;  // return the middle one
    }
public   boolean isPalindrome(){
        if(head == null || head.next == null){
            return  false;

        }
        Node middle = findMiddle(head);
        Node secondHalfStart = reverse(middle.next);

        Node firstHalfStart = head;

        while (secondHalfStart !=null){
            if(firstHalfStart.data != secondHalfStart.data)
            {
              return false;

            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return  true;


}




    public static void main(String[] args) {

        palindrome_linik_list list = new palindrome_linik_list();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(1);
//        list.addFirst(4);
        list.printList();
       boolean result =  list.isPalindrome();
        if(result) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
