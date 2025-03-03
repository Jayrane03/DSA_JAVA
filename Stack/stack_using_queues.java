package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class stack_using_queues {
//    Stack using 2 Queues

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public  void push(int data){
        while (!q1.isEmpty()){
            q2.offer(q1.poll());     // offer means in insertion and poll means deletion

        }
        q1.offer(data);
        while (!q2.isEmpty()){
            q1.offer(q2.poll());     // offer means in insertion and poll means deletion

        }
    }

    public  int peek(){
        if(q1.isEmpty()){
            System.out.println("Stack is empty");
            return  -1;

        }
        return  q1.peek();
    }
    public  int pop(){
        if(q1.isEmpty()){
            System.out.println("Stack is empty");
            return  -1;

        }
        return  q1.poll();
    }



    public static void main(String[] args) {
        stack_using_queues stack = new stack_using_queues();
        stack.push(10);
        stack.peek();  //10
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

//        Time complexity : O(1);

    }   // ans is 40 40 30
}
