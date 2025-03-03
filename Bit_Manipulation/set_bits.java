package Bit_Manipulation;

public class set_bits {
    public static void main(String[] args) {
        int n =5;
        int pos =1;
        int bitMask = 1<<pos;
        /*
        1 << 1;
        0001 << 1;
        0010 << 1;

        0010  | 0101  
        0111 == 7 in decimal
         */
        int newNumber = bitMask | n;
        System.out.println(newNumber);
        // if((bitMask | n) == 0){
        //     System.out.println("Bit is not set");
        // }
        // else{
        //     System.out.println("Bit is set");
        // }
    }
}
