// package Recursion;
// Calculate the height of the stack 
//Print x^n (Stack height  = n)
public class calucate_power {
    // public static int calculatePower(int x , int n){
    //     if(n == 0){
    //         return 1;  //Base case 1

    //     }
    //     if(x == 0){
    //         return 0;   //Base case 2
    //     }
    //     int xPowerofN = calculatePower(x, n-1);
    //     int xPower = xPowerofN * x;
    //     return xPower;
        
    // }
    // For the height = logn
    public static int calculatePower(int x , int n){
        if(n == 0){
            return 1;  //Base case 1

        }
        if(x == 0){
            return 0;   //Base case 2
        }
       
        if(n%2 == 0){
            return calculatePower(x, n/2) * calculatePower(x, n/2);

         }
         else{
            return  calculatePower(x, n/2) * calculatePower(x, n/2) * x;
         }
    }
    public static void main(String[] args) {
        int x =2 ; int n =10;
        int ans  = calculatePower(x, n);
        System.out.println(ans);
    }
}
