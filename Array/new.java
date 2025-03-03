package Array;

import java.util.*;

class New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int x = 20;
        int marks[] = new int[size];
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
           
        }
        for (int i = 0; i< size; i++) {
            System.out.println(marks[i]);
            if(marks[i]  == x){
                System.out.println("found"+ marks[i]);
            }
            else{
                System.out.println("not found");
            }
        }
    }
}
