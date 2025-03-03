package Linked_List;
//{
//compare two linked list to be equal in size and all data 
//        // recursive way
//        if(head1 == null && head2 == null)
//        return true;
//
//        if(head1 == null && head2 !=null)
//        return false;
//        if(head1 != null && head2 ==null)
//        return false;
//
//        if(head1.data != head2.data)
//        return false;
//
//        return compareLists(head1.next , head2.next);


// while(head1!=null || head2!=null){
//     if(head1==null || head2 == null){
//         return false;
//     }
//     if(head1.data != head2.data){
//         return false;
//     }
//     head1 = head1.next;
//     head2 = head2.next;

// }
// return true;

//    }
public class link_list_two {
    Node head;
    public  class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

//Add the element in the list ;
    public  void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;     // check whether a link list exist or not

        }
        newNode.next = head;      // newElement ->next  point to head so it will be head
        head = newNode;

    }

//    print the list
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

public Node removeDuplicate(){
        if(head == null){
            return null;
        }
        Node current = head;
        while(current.next !=null){
            if(current.data == current.next.data){   //  list = 1 1 2 3 4 4   if 1 == 1 then  1.next = 2
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }

        }
        return  head;

}

public Node removeFirst(){
        if(head == null){
            return null;
        }
         head = head.next;
        return head;

}
//Delete the nth node from the last for eg 1 2 3 4   n=2 so delete 3 from the list
    public Node removeNthFromEnd(int pos){
        if(head.next == null){
            return  null;
        }
//        find the size
        int size = 0;
        Node currentNode = head;
        while(currentNode !=null){
            currentNode = currentNode.next;
            size ++;

        }
//        Distance from start (DFS)   = size - n +1;  for eg size =5 , n=2 .. 5-2+1 = 4
//        For the list 1,2,3,4,5   from the last 2nd pos  is 4;



        return  head;
    }
//    Find and delete the nth node in the linkedList
    public Node deleteNode(int position){
        if(head == null){
            return null;
        }
        if(position == 0){
            head = head.next;
            return head;

        }
        Node currentNode  = head;
        int index = 0;
        // Traverse the list until the node before the one to be deleted
        while(currentNode != null && index < position-1){
            currentNode = currentNode.next;
            index ++;
        }
        // If the node to be deleted is not the last node
            if(currentNode !=null && currentNode.next !=null){
            currentNode.next = currentNode.next.next;
            }
            return  head;

    }

    public static void main(String[] args) {
        link_list_two list = new link_list_two();
            list.addFirst(1);
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(4
        );
//        list.printList();
//        list.deleteNode(3);

//        list.printList();
//        list.removeFirst();
//        System.out.println("Remove the first node ");

        list.removeDuplicate();
        list.printList();

    }
}
