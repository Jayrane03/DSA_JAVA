package Doubly_Link_List;

public class doubly_link_list {
      Node head;
      Node tail;

    public class Node {
            int data;
            Node prev;
            Node next;

            Node(int data){
                this.data = data;
                this.prev = null;
                this.next = null;
            }

    }
    public  void addFirst(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;

        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;

    }

    public  void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;

        }
        currentNode.next = newNode;
        newNode.prev = currentNode;
        
    }

    public void printList(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        Node currentNode = head;
        while (currentNode !=null){
            System.out.print(currentNode.data + " <-> ");
            currentNode = currentNode.next;

        }
        System.out.println("NULL");

    }

    public static void main(String[] args) {
        doubly_link_list double_list = new doubly_link_list();
        double_list.addFirst(1);
        double_list.addFirst(2);
        double_list.addFirst(3);
        double_list.printList();


    }



}
