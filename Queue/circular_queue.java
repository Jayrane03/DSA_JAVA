package Queue;

public class circular_queue {


    static  class  Queue{
        static  int arr[];
        static  int size;
        static  int rear = -1;
        static  int front = -1;


        Queue(int n){
            arr = new int[n];
            this.size = n;

        }
        public  static boolean isEmpty(){
            return rear == -1 && front == -1;

        }
        public  static  boolean isFull(){
            return  (rear + 1) %size ==  front;
        }

        public  static  void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
//            1st element add
            if(front == -1){
                front  = 0;

            }

            rear  = (rear+1) %size;
            arr[rear]= data;

        }
        public  static  int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if(rear == front){
                rear = front = -1;

            }else {
                front = (front+1) %size; //if front is on the last index
            }
            return  result;

        }
        public  static  int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;

            }
            return  arr[front];

        }

    }
    public static void main(String[] args) {
        Queue  que= new Queue(7);
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        System.out.println(que.remove());
        que.add(5);
        System.out.println(que.remove());
        que.add(6);



        while (!que.isEmpty()){
            System.out.println(que.peek());
            que.remove();
        }

    }
}
