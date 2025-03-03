package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.SortedMap;
//any element > root will come on the right side and element < root will come on the right side
public class binary_tree {

    static  class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }


    }
    static  class  BinaryTree{
        static  int index = -1;
        public  static  Node buildTree(int nodes[]){
            index++;  //create the root at 0 index
            if(nodes[index] == -1){
                return  null;

            }
//            First it will create left subtree and then right subtree
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

        return  newNode;  //return the root node

        }

    }
    public static void preorder(Node root){
//        In this first comes root then left subtree and right substree
//        Time complexity  : O(n)
        /*
          1 - Print root
          2 - Print left subtree
          3 - Print right subtree
        */
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public  static  void inorder(Node root){
         /*
          1 - Print left subtree
          2 - Print root
          3 - Print right subtree
          //        Time complexity  : O(n)
        */
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
    public  static  void postorder(Node root){
          /*
          1 - Print left subtree
          2 - Print right subtree
          3 - Print root
          //        Time complexity  : O(n)
        */
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");

    }


    public static void levelOrder(Node root){
//        Here queue is used due to its FIFO Technique for implementation for going to each level in the Tree
        Queue<Node> q = new LinkedList<>();
        q.add(root); // add root and null node at the beginning of the   queue

        q.add(null);

        while (!q.isEmpty()){
            if(root == null){
                return;
            }
            Node currentNode = q.remove();
            if(currentNode == null){
                System.out.println(); // print the next line
                if(q.isEmpty()){
                    break;
                }
                else {
                    q.add(null);
                }

            }
            else{
                System.out.print(currentNode.data+" ");
                if(currentNode.left != null){
                    q.add(currentNode.left);
                }
                if(currentNode.right != null){
                    q.add(currentNode.right);

                }
            }
        }

    }

    public  static  int countNodes(Node root){
        if(root == null){
            return 0;
        }
//        time complexitity = O(n);
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);

        return leftNodes + rightNodes +1;
    }
    public  static  int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
//        time complexitity = O(n);
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    public  static  int calHeight(Node root){
        if (root == null){
            return 0;
        }
        int leftHeight = calHeight(root.left);
        int rightHeight = calHeight(root.right);

        int treeHeight = Math.max(leftHeight , rightHeight) + 1;

        return  treeHeight;

    }

    public  static int diameter(Node root){
        if(root == null){
            return  0;

        }
//        Time complexity : O(N^2)
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = calHeight(root.left)  + calHeight(root.right) +1;

        return  Math.max(diam3 , Math.max(diam1 , diam2));

    }
    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht , int diam){
            this.ht = ht;
            this.diam = diam;
        }

    }
    public static  TreeInfo diameter2(Node root){
        if(root == null){
            return  new TreeInfo(0,0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight =Math.max(left.ht , right.ht) +1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int myDiam = Math.max(Math.max(diam1 , diam2) ,diam3);

        TreeInfo myInfo = new TreeInfo(myHeight , myDiam);
        return  myInfo;


    }
    public static void main(String[] args) {
            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(nodes);
        System.out.println("Preorder Traversal :");
            preorder(root);
        System.out.println();
        System.out.println("Inorder Traversal : ");
            inorder(root);
        System.out.println();
        System.out.println("Post order Traversal :");
        postorder(root);
        System.out.println();
        System.out.println("Level Order Traversal :");
        levelOrder(root);


        System.out.println("Count of the nodes of the Tree :"+countNodes(root));
        System.out.println("Left Count: "+countNodes(root.left));
        System.out.println("Right count :"+countNodes(root.right));




        System.out.println("Sum of Nodes of the Tree :"+sumOfNodes(root));
        System.out.println("Left Sum of Nodes :"+sumOfNodes(root.left));
        System.out.println("Right Sum of Nodes :"+sumOfNodes(root.right));


        System.out.println("Height of the Tree:"+calHeight(root));
        System.out.println("Left Subtree Height :"+calHeight(root.left));
        System.out.println("Right Subtree Height :"+calHeight(root.right));


        System.out.println("Diameter of the Tree  O(N^2):"+diameter(root));
        System.out.println("Left Diameter :"+diameter(root.left));
        System.out.println("Right Diameter : "+diameter(root.right));

        System.out.println("Diameter of the Tree  O(N) :"+diameter2(root).diam);

    }
}
