package Home_Work_Quest;
//Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3).
 //Search for the number 7 & display its index.

public class link_list_one{
    Node head ;
    Node tail ;
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

//  Add first in the link list

    public  void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;


    }
    //    add last
    public  void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        Node currentNode = head;   // Initalize the current Node with head means starting element
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;


    }

    public void searchIndex(int index){

    }




    //Print the list
    public void printList(){
//      Node newNode  = new Node(data);
        if(head == null){
//          head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode !=null){
            System.out.print(currentNode.data +"->");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        link_list_one list = new link_list_one();
        list.addLast(1);
        list.addLast(5);
        list.addLast(7);
        list.addLast(5);
        list.addLast(8);
        list.addLast(2);
        list.addLast(3);
        list.printList();
    }

}
