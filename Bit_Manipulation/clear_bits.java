package Bit_Manipulation;

public class clear_bits {
    public static void main(String[] args) {
        
        /*
        Go the postion and clear the bit means make it to 0;
         Clear the 3rd bit (pos = 2) ,of a number n (n= 0101) -> 5
        bit mask  1<<i;
        Operaiton AND with NOT
        ---> NOT means all zero will turn one and vise versa
        Logic
        1<<2;
        0001 << 2
        0100;
        0100 & ~0001;
        0100 & 1110;
        0100;
         
         */
        int n=5;
        int pos =2;
        int mask = 1<<pos;
        int ans = n & ~mask;

        System.out.println(ans);

    }
}
