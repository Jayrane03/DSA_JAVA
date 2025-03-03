// package Recursion;

public class quest_three {
    //find the factorial of the number by using recursion;
    public static int calFactorial(int number ){
        if(number == 1 || number ==0){
            return 1;
        }
        int fact_number = calFactorial(number - 1);
        int factorial = fact_number * number;
        return factorial;

    }
    public static void main(String[] args) {
        int number = 8;
        int answer = calFactorial(number);
        System.out.println(answer);
    } 
}
