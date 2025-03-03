package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class binaryTreeOne {

    static class  Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    static  class Tree{
        static  int index = -1;
        public  static  Node createTree(int nodes[]){
            index++;
            if(nodes[index] == -1){
                return  null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = createTree(nodes);
            newNode.right = createTree(nodes);

            return  newNode;
        }

        public  static void preOrder(Node root){
            if (root == null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public  static  void inOrder(Node root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

        public  static  int sumAtKthLevel(Node root , int k){
            if (root == null) {
                return 0;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            int level = 0;
            int sum = 0;


            while (!q.isEmpty()){
                int size = q.size();
                sum = 0;  // Reset sum for each level
                for (int i = 0; i < size; i++) {
                    Node node = q.poll();

                    // If we're at the kth level, sum up the values
                    if (level == k) {
                        sum += node.data;
                    }

                    // Add children to the queue
                    if (node.left != null) {
                        q.add(node.left);
                    }
                    if (node.right != null) {
                        q.add(node.right);
                    }
                }

                // If we've reached the kth level, return the sum
                if (level == k) {
                    return sum;
                }

                level++;
            }
            // If k is greater than the height of the tree
            return 0;
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Tree tree= new Tree();
        Node root = tree.createTree(nodes);

        System.out.println("Preorder Travel:");
        Tree.preOrder(root);
        System.out.println();
        System.out.println("Inorder Travel:");
        Tree.inOrder(root);

        System.out.println();
        int k = 2;
        int sum = Tree.sumAtKthLevel(root, k);
        System.out.println("Sum at level " + k + ": " + sum);

    }


}
