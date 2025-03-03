// package Recursion;

public class ques_two {
    public static void printNaturalNum(int i , int n , int sum){
        if(n==i){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printNaturalNum(i+1 , n , sum);
    }
    public static void main(String[] args) {
        // print the sum of first n natural numbers 
        printNaturalNum(1 ,5 , 0);
    }
}
