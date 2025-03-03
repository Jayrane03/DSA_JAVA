package Bit_Manipulation;

public class get_bits {
    public static void main(String[] args) {
        /*  Get the 3rd bit  (position =2) of a number n . (n 0101)
         Bit Mask  1<<i
         Operation  AND

         For pos=3
          1 -  1<<3;
         0001 << 3;
         1000 ;

         1000 & 0101;
         0000 
        
        
         */ 

        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;

        if((bitMask &  n) == 0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }

    }
}
