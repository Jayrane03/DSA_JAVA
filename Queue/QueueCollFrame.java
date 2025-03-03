package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueCollFrame {
    public static void main(String[] args) {
//        implementation of queue using a Arraydeque
        Queue<Integer> que = new ArrayDeque<>();
//        Queue<Integer> que = new LinkedList<>();

        que.add(1);
        que.add(2);
        que.add(3);


        while (!que.isEmpty()){
            System.out.println(que.peek());
            que.remove();
        }

    }
}
