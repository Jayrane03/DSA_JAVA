package Queue;

import java.util.Stack;
// using two real stacks we have created a fake Queue   simple Conevert LIFO(stack)  to FIFO(queue)
public class Queue_Two_Stack {
//    Important question : Queue using two stacks

    static  class  Queue{
        static Stack<Integer>  s1 = new Stack<>();
        static Stack<Integer>  s2 = new Stack<>();

        public  static  boolean isEmpty(){
            return  s1.isEmpty();

        }
        public  static  void  add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());  // Remove data from s1 and add to s2

            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
//            s2.push(data);
        }
        public  static  int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return  -1;
            }
           return  s1.pop();  // s1's top will be the front of the queue.

        }
        public  static  int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return  -1;
            }
            return  s1.peek();

        }
    }
    public static void main(String[] args) {
            Queue que = new Queue();
            que.add(1);
            que.add(2);
            que.add(3);
            que.add(4);

            while (!que.isEmpty()){
                System.out.println(que.peek());
                que.remove();
            }
    }
}
