

import javax.sound.midi.Soundbank;

// find the series till the nth term ;
public class fibonacci_series {
    public static void fibonacci_Series( int a , int b , int number){
       
        
        if(number ==0){
            return;
        }

        int next_number = a + b;
        System.out.print(next_number + " ");
        fibonacci_Series(b , next_number , number-1);
        
        
        
    }
    public static void main(String[] args) {
    
        int a = 0 ; int b= 1;
        System.out.print(a +  " " + b + " ");
       
        int number = 7;
         fibonacci_Series(a,b,number-2);   
    }
    
}
