package By_Own;

public class link_list {
    Node head;
  public class Node {
      String data;
      Node next;

      Node(String data) {
          this.data = data;
          this.next = null;

      }
  }

//  Add first in the link list

    public  void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;


    }
//    add last
    public  void addLast(String data){
      Node newNode = new Node(data);
      if(head == null){
          head = newNode;
          return;
      }
      Node currentNode = head;   // Initalize the current Node with head means starting element
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;


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
        link_list list = new link_list();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.printList();
        list.addLast("list");
        list.printList();
    }

}
