package Doubly_Link_List;
//Insert a node in a doubly linked list in a sorted manner and reverse a doubly linked list
import java.io.*;
import java.util.stream.IntStream;

class DoublyLinkedList {
    public DoublyLinkedListNode head;
    public DoublyLinkedListNode tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
        }

        this.tail = node;
    }
}

class DoublyLinkedListPrintHelper {
    public static void printList(DoublyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
}

class Result {

    // Insert a node in a sorted order in a doubly linked list
    public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);

        // If the list is empty
        if (llist == null) {
            return newNode;
        }

        // If the new node should be inserted at the head
        if (data < llist.data) {
            newNode.next = llist;
            llist.prev = newNode;
            return newNode; // Return the new head of the list
        }

        DoublyLinkedListNode temp = llist;

        // Traverse the list to find the correct position for the new node
        while (temp.next != null && temp.data < data) {
            temp = temp.next;
        }

        // Insert the new node at the end
        if (temp.next == null && temp.data < data) {
            temp.next = newNode;
            newNode.prev = temp;
        } else {
            // Insert the new node in between nodes
            newNode.prev = temp.prev;
            newNode.next = temp;
            if (temp.prev != null) {
                temp.prev.next = newNode;
            }
            temp.prev = newNode;
        }

        // Return the head of the list
        return llist;
    }

    // Reverse the doubly linked list
    public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
        if (llist == null || llist.next == null) {
            return llist;
        }

        DoublyLinkedListNode current = llist;
        DoublyLinkedListNode temp = null;

        // Swap the next and prev pointers of each node to reverse the list
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        // Update the head to be the last non-null node
        if (temp != null) {
            llist = temp.prev;
        }

        return llist;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                DoublyLinkedList llist = new DoublyLinkedList();

                int llistCount = Integer.parseInt(bufferedReader.readLine().trim());

                IntStream.range(0, llistCount).forEach(i -> {
                    try {
                        int llistItem = Integer.parseInt(bufferedReader.readLine().trim());
                        llist.insertNode(llistItem);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                int data = Integer.parseInt(bufferedReader.readLine().trim());

                // Sorted Insert
                llist.head = Result.sortedInsert(llist.head, data);

                // Reverse the list
                DoublyLinkedListNode reversedList = Result.reverse(llist.head);

                // Print the reversed list
                DoublyLinkedListPrintHelper.printList(reversedList, " ", bufferedWriter);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
Input Example:
1
4
2
5
7
10
6

Expected Output:
10 7 6 5 2
 */
