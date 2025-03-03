package Array_Deque;

import java.util.ArrayDeque;

public class array_deque {
    public static void main(String[] args) {

        ArrayDeque<Integer> arrayDequue = new ArrayDeque<>();
        arrayDequue.add(122);
        arrayDequue.add(12);
        arrayDequue.add(1);
        arrayDequue.addFirst(23);
        arrayDequue.addLast(33);

//        arrayDequue.removeFirst();
//        arrayDequue.removeLast();
        System.out.println(arrayDequue);
        System.out.println(arrayDequue.getFirst());
        System.out.println(arrayDequue.getLast());
    }
}
