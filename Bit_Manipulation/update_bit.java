package Bit_Manipulation;

public class update_bit {
    public static void main(String[] args) {
        /*
          Update the 2nd bit (pos =1) of a number to 1 (n=0101);
          Final Output = 0111;
          Logic
          1<<1;
        0001 <<1 ;
        0010;
        0010 | 0101;
        0111;
          */ 
          int n  =5 ;
          int pos = 1;
          int bitMask = 1<<pos;
          int update_bit = bitMask | n;

          System.out.println(update_bit);
    }
}
