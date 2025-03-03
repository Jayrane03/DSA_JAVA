// package Recursion;

public class question_one {
    public static void printNumbers(int n){
       if(n>5){
        return;
       }
       System.out.println(n);
       printNumbers(n+1);
    }
    public static void main(String[] args) {
        // Print number from 5 ot 1  and 1 to 5
        printNumbers(1);
    }
}
